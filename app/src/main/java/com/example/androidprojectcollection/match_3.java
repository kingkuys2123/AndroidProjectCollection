package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Random;

public class match_3 extends AppCompatActivity implements View.OnClickListener {

    TextView scoreView;
    Button[][] buttons = new Button[5][5];
    Button btnRestart;
    int[][] colors = new int[5][5];
    int score = 0;
    Button lastClickedButton = null;

    boolean selectToSwap = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_match3);

        Toast.makeText(this, "Quitco, Kyle Matthew M." +
                "\nMatch 3", Toast.LENGTH_SHORT).show();

        initBtns();
        randomizeBtns();
        setClickListeners();

        scoreView = findViewById(R.id.scoreText);

        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score=0;
                updateScore(score);
                randomizeBtns();
            }
        });

    }

    private void initBtns() {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                int buttonId = this.getResources().getIdentifier("btn" + ((i * 5) + j + 1), "id", this.getPackageName());
                buttons[i][j] = findViewById(buttonId);
            }
        }

        btnRestart = findViewById(R.id.btnRestart);
    }

    private void randomizeBtns() {
        Random random = new Random();

        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                int n = random.nextInt(4);

                switch (n) {
                    case 0:
                        colors[i][j] = Color.RED;
                        break;
                    case 1:
                        colors[i][j] = Color.GREEN;
                        break;
                    case 2:
                        colors[i][j] = Color.BLUE;
                        break;
                    case 3:
                        colors[i][j] = Color.YELLOW;
                        break;
                    default:
                        colors[i][j] = Color.RED;
                }
            }
        }

        updateBtns();
    }

    private void updateBtns() {
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i].length; j++) {
                buttons[i][j].setBackgroundColor(colors[i][j]);
            }
        }
    }

    private void setClickListeners() {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                buttons[i][j].setOnClickListener(this);
            }
        }
    }

    @Override
    public void onClick(View v) {
        Button clickedButton = (Button) v;

        if (!selectToSwap) {
            highlightBtn(clickedButton);

            lastClickedButton = clickedButton;
            selectToSwap = true;

            return;
        }

        int clickedRow = getRowLoc(clickedButton);
        int clickedCol = getColLoc(clickedButton);

        int lastClickedRow = getRowLoc(lastClickedButton);
        int lastClickedCol = getColLoc(lastClickedButton);

        if ((Math.abs(clickedRow - lastClickedRow) == 1 && clickedCol == lastClickedCol) || (Math.abs(clickedCol - lastClickedCol) == 1 && clickedRow == lastClickedRow)) {

            swapColors(clickedRow, clickedCol, lastClickedRow, lastClickedCol);

            updateBtns();

            lastClickedButton.setText(""); // Remove X from the last clicked button
            lastClickedButton = null;

            selectToSwap = false;
        }
        else {
            highlightBtn(clickedButton);
            lastClickedButton = clickedButton;
        }
    }

    private void highlightBtn(Button button) {
        if (lastClickedButton != null) {
            lastClickedButton.setText("");
        }

        button.setText("↑\n←→\n↓");
        button.setTextColor(Color.BLACK);
        button.setTextSize(25);
    }

    private void swapColors(int clickedRow, int clickedCol, int lastClickedRow, int lastClickedCol) {
        int tempColor = getColorID(clickedRow, clickedCol);

        colors[clickedRow][clickedCol] = getColorID(lastClickedRow, lastClickedCol);
        colors[lastClickedRow][lastClickedCol] = tempColor;

        checkBoard();
    }

    private int getColLoc(Button button) {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                if (buttons[i][j] == button) {
                    return j;
                }
            }
        }

        return -1;
    }

    private int getRowLoc(Button button) {
        for (int i = 0; i < buttons.length; i++) {
            for (int j = 0; j < buttons[i].length; j++) {
                if (buttons[i][j] == button) {
                    return i;
                }
            }
        }

        return -1;
    }

    private int getColorID(int row, int col) {
        return colors[row][col];
    }

    private void checkBoard() {
        boolean foundMatch = true;
        int tempScore = 0;

        while (foundMatch) {
            foundMatch = false;

            // horizontal
            for (int i = 0; i < colors.length; i++) {
                for (int j = 0; j < colors[i].length - 2; j++) {
                    if (colors[i][j] == colors[i][j + 1] && colors[i][j] == colors[i][j + 2]) {
                        foundMatch = true;
                        replaceBtns(i, j, i, j + 1, i, j + 2);
                        tempScore++;
                    }
                }
            }

            // vertical
            for (int j = 0; j < colors[0].length; j++) {
                for (int i = 0; i < colors.length - 2; i++) {
                    if (colors[i][j] == colors[i + 1][j] && colors[i][j] == colors[i + 2][j]) {
                        foundMatch = true;
                        replaceBtns(i, j, i + 1, j, i + 2, j);
                        tempScore++;
                    }
                }
            }
        }

        updateScore(tempScore);
    }

    private void replaceBtns(int row1, int col1, int row2, int col2, int row3, int col3) {
        randomizeNewBtn(row1, col1);
        randomizeNewBtn(row2, col2);
        randomizeNewBtn(row3, col3);
    }

    private void randomizeNewBtn(int row, int col){
        Random random = new Random();
        int n = random.nextInt(4);

        switch (n) {
            case 0:
                colors[row][col] = Color.RED;
                break;
            case 1:
                colors[row][col] = Color.GREEN;
                break;
            case 2:
                colors[row][col] = Color.BLUE;
                break;
            case 3:
                colors[row][col] = Color.YELLOW;
                break;
            default:
                colors[row][col] = Color.RED;
        }
    }

    private void updateScore(int updatedScore) {
        score += updatedScore;
        scoreView.setText("Score: " + score);
    }

}