package com.example.androidprojectcollection;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

public class button_exercise extends AppCompatActivity {

    Button btnClose, btnToast, btnChangeBG, btnChangeButtonBG, btnDisappear;

    ConstraintLayout constraintButtonLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_button_exercise);

        btnClose = findViewById(R.id.btnClose);

        btnClose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent1 = new Intent(button_exercise.this, return_activity.class); //This Activity, destination class/activity
                startActivity(intent1);
            }
        });

        btnToast = findViewById(R.id.btnToast);

        btnToast.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                CharSequence text = "Hello World!";

                int duration = Toast.LENGTH_SHORT;

                Toast toast = Toast.makeText(button_exercise.this, text, duration);

                toast.show();

            }
        });

        btnChangeBG = findViewById(R.id.btnChangeBG);

        constraintButtonLayout = findViewById(R.id.constraintButtonLayout);

        btnChangeBG.setOnClickListener(new View.OnClickListener(){
            int color=1;

            @Override
            public void onClick(View view){
                if(color==1)
                {
                    constraintButtonLayout.setBackgroundColor(Color.GRAY);
                    color++;
                }
                else{
                    constraintButtonLayout.setBackgroundColor(Color.DKGRAY);
                    color--;
                }
            }
        });

        btnChangeButtonBG = findViewById(R.id.btnChangeButtonBG);

        btnChangeButtonBG.setOnClickListener(new View.OnClickListener() {

            int color=1;

            @Override
            public void onClick(View view){
                if(color==1){
                    btnChangeButtonBG.setBackgroundColor(Color.RED);
                    color++;
                }
                else{
                    btnChangeButtonBG.setBackgroundColor(Color.MAGENTA);
                    color--;
                }
            }
        });

        btnDisappear = findViewById(R.id.btnDisappear);

        btnDisappear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                btnDisappear.setVisibility(View.INVISIBLE);
            }
        });
    }
}