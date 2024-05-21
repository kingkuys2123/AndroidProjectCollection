package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class tic_tac_toe extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnRestart;
    TextView topText;
    ConstraintLayout btnLayout;

    int plyrTurn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tic_tac_toe);

        Toast.makeText(this, "Quitco, Kyle Matthew M." +
                "\nTic Tac Toe Game", Toast.LENGTH_SHORT).show();

        initBtns();

        btnLayout = findViewById(R.id.btnLayout);
        btnLayout.setBackgroundColor(Color.BLUE);

        topText = findViewById(R.id.topText);
        topText.setText("Player O's Turn");

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn1.getText()==""){
                    if(plyrTurn==0){
                        btn1.setText("O");
                        plyrTurn = 1;
                        btnLayout.setBackgroundColor(Color.RED);
                        topText.setText("Player X's Turn");
                        checkWin();
                    }
                    else{
                        btn1.setText("X");
                        plyrTurn = 0;
                        btnLayout.setBackgroundColor(Color.BLUE);
                        topText.setText("Player O's Turn");
                        checkWin();
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn2.getText()==""){
                    if(plyrTurn==0){
                        btn2.setText("O");
                        plyrTurn = 1;
                        btnLayout.setBackgroundColor(Color.RED);
                        topText.setText("Player X's Turn");
                        checkWin();
                    }
                    else{
                        btn2.setText("X");
                        plyrTurn = 0;
                        btnLayout.setBackgroundColor(Color.BLUE);
                        topText.setText("Player O's Turn");
                        checkWin();
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn3.getText()==""){
                    if(plyrTurn==0){
                        btn3.setText("O");
                        plyrTurn = 1;
                        btnLayout.setBackgroundColor(Color.RED);
                        topText.setText("Player X's Turn");
                        checkWin();
                    }
                    else{
                        btn3.setText("X");
                        plyrTurn = 0;
                        btnLayout.setBackgroundColor(Color.BLUE);
                        topText.setText("Player O's Turn");
                        checkWin();
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn4.getText()==""){
                    if(plyrTurn==0){
                        btn4.setText("O");
                        plyrTurn = 1;
                        btnLayout.setBackgroundColor(Color.RED);
                        topText.setText("Player X's Turn");
                        checkWin();
                    }
                    else{
                        btn4.setText("X");
                        plyrTurn = 0;
                        btnLayout.setBackgroundColor(Color.BLUE);
                        topText.setText("Player O's Turn");
                        checkWin();
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn5.getText()==""){
                    if(plyrTurn==0){
                        btn5.setText("O");
                        plyrTurn = 1;
                        btnLayout.setBackgroundColor(Color.RED);
                        topText.setText("Player X's Turn");
                        checkWin();
                    }
                    else{
                        btn5.setText("X");
                        plyrTurn = 0;
                        btnLayout.setBackgroundColor(Color.BLUE);
                        topText.setText("Player O's Turn");
                        checkWin();
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn6.getText()==""){
                    if(plyrTurn==0){
                        btn6.setText("O");
                        plyrTurn = 1;
                        btnLayout.setBackgroundColor(Color.RED);
                        topText.setText("Player X's Turn");
                        checkWin();
                    }
                    else{
                        btn6.setText("X");
                        plyrTurn = 0;
                        btnLayout.setBackgroundColor(Color.BLUE);
                        topText.setText("Player O's Turn");
                        checkWin();
                    }
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn7.getText()==""){
                    if(plyrTurn==0){
                        btn7.setText("O");
                        plyrTurn = 1;
                        btnLayout.setBackgroundColor(Color.RED);
                        topText.setText("Player X's Turn");
                        checkWin();
                    }
                    else{
                        btn7.setText("X");
                        plyrTurn = 0;
                        btnLayout.setBackgroundColor(Color.BLUE);
                        topText.setText("Player O's Turn");
                        checkWin();
                    }
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn8.getText()==""){
                    if(plyrTurn==0){
                        btn8.setText("O");
                        plyrTurn = 1;
                        btnLayout.setBackgroundColor(Color.RED);
                        topText.setText("Player X's Turn");
                        checkWin();
                    }
                    else{
                        btn8.setText("X");
                        plyrTurn = 0;
                        btnLayout.setBackgroundColor(Color.BLUE);
                        topText.setText("Player O's Turn");
                        checkWin();
                    }
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btn9.getText()==""){
                    if(plyrTurn==0){
                        btn9.setText("O");
                        plyrTurn = 1;
                        btnLayout.setBackgroundColor(Color.RED);
                        topText.setText("Player X's Turn");
                        checkWin();
                    }
                    else{
                        btn9.setText("X");
                        plyrTurn = 0;
                        btnLayout.setBackgroundColor(Color.BLUE);
                        topText.setText("Player O's Turn");
                        checkWin();
                    }
                }
            }
        });



        btnRestart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btn1.setText("");
                btn2.setText("");
                btn3.setText("");
                btn4.setText("");
                btn5.setText("");
                btn6.setText("");
                btn7.setText("");
                btn8.setText("");
                btn9.setText("");

                enableBtns();

                plyrTurn = 0;
                btnLayout.setBackgroundColor(Color.BLUE);
                topText.setText("Player O's Turn");
            }
        });


    }

    private void initBtns(){
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnRestart = findViewById(R.id.btnRestart);
    }

    private void disableBtns(){
        btn1.setEnabled(false);
        btn2.setEnabled(false);
        btn3.setEnabled(false);
        btn4.setEnabled(false);
        btn5.setEnabled(false);
        btn6.setEnabled(false);
        btn7.setEnabled(false);
        btn8.setEnabled(false);
        btn9.setEnabled(false);
    }

    private void enableBtns(){
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
    }

    private void checkWin(){
        if(btn1.getText()=="X" && btn2.getText()=="X" && btn3.getText()=="X"){
            topText.setText("Player X Wins!");
            disableBtns();
            return;
        }
        if(btn4.getText()=="X" && btn5.getText()=="X" && btn6.getText()=="X"){
            topText.setText("Player X Wins!");
            disableBtns();
            return;
        }
        if(btn7.getText()=="X" && btn8.getText()=="X" && btn9.getText()=="X"){
            topText.setText("Player X Wins!");
            disableBtns();
            return;
        }
        if(btn1.getText()=="X" && btn4.getText()=="X" && btn7.getText()=="X"){
            topText.setText("Player X Wins!");
            disableBtns();
            return;
        }
        if(btn2.getText()=="X" && btn5.getText()=="X" && btn8.getText()=="X"){
            topText.setText("Player X Wins!");
            disableBtns();
            return;
        }
        if(btn3.getText()=="X" && btn6.getText()=="X" && btn9.getText()=="X"){
            topText.setText("Player X Wins!");
            disableBtns();
            return;
        }
        if(btn1.getText()=="X" && btn5.getText()=="X" && btn9.getText()=="X"){
            topText.setText("Player X Wins!");
            disableBtns();
            return;
        }
        if(btn7.getText()=="X" && btn5.getText()=="X" && btn3.getText()=="X"){
            topText.setText("Player X Wins!");
            disableBtns();
            return;
        }
        if(btn1.getText()=="O" && btn2.getText()=="O" && btn3.getText()=="O"){
            topText.setText("Player O Wins!");
            disableBtns();
            return;
        }
        if(btn4.getText()=="O" && btn5.getText()=="O" && btn6.getText()=="O"){
            topText.setText("Player O Wins!");
            disableBtns();
            return;
        }
        if(btn7.getText()=="O" && btn8.getText()=="O" && btn9.getText()=="O"){
            topText.setText("Player O Wins!");
            disableBtns();
            return;
        }
        if(btn1.getText()=="O" && btn4.getText()=="O" && btn7.getText()=="O"){
            topText.setText("Player O Wins!");
            disableBtns();
            return;
        }
        if(btn2.getText()=="O" && btn5.getText()=="O" && btn8.getText()=="O"){
            topText.setText("Player O Wins!");
            disableBtns();
            return;
        }
        if(btn3.getText()=="O" && btn6.getText()=="O" && btn9.getText()=="O"){
            topText.setText("Player O Wins!");
            disableBtns();
            return;
        }
        if(btn1.getText()=="O" && btn5.getText()=="O" && btn9.getText()=="O"){
            topText.setText("Player O Wins!");
            disableBtns();
            return;
        }
        if(btn7.getText()=="O" && btn5.getText()=="O" && btn3.getText()=="O"){
            topText.setText("Player O Wins!");
            disableBtns();
            return;
        }
    }
}