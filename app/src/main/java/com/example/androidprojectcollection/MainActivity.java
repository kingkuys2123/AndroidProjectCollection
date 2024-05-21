package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btn10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn1 = (Button)findViewById(R.id.btnLayoutExercise);

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, layout_exercise.class); //This Activity, destination class/activity
                startActivity(intent1);
            }
        });

        btn2 = (Button)findViewById(R.id.btnButtonExercise);

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, button_exercise.class); //This Activity, destination class/activity
                startActivity(intent1);
            }
        });

        btn3 = (Button)findViewById(R.id.btnCalculatorExercise);

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, calculator_activity.class); //This Activity, destination class/activity
                startActivity(intent1);
            }
        });

        btn4 = findViewById(R.id.btnMatch3);

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, match_3.class);
                startActivity(intent1);
            }
        });

        btn5 = findViewById(R.id.btnME);

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, midterm_exam.class);
                startActivity(intent1);
            }
        });

        btn6 = findViewById(R.id.btnPassingIntents);

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, PassingIntentsExercise.class);
                startActivity(intent1);
            }
        });

        btn7 = findViewById(R.id.btnMenus);

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, MenuExercise.class);
                startActivity(intent1);
            }
        });

        btn8 = findViewById(R.id.btnMaps);

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(MainActivity.this, MapsExercise.class);
                startActivity(intent1);
            }
        });

        btn9 = findViewById(R.id.btnNine);

        btn10  = findViewById(R.id.btnTen);

    }
}

