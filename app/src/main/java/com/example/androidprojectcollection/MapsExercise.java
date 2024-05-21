package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MapsExercise extends AppCompatActivity {

    ImageButton vacaBtn1, vacaBtn2, vacaBtn3, vacaBtn4, vacaBtn5;

    ConstraintLayout activityBG;

    TextView vacationName;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_maps_exercise);

        initComponents();

        vacaBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vacationName.setText("HERMIT'S COVE");

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.202319348682693, 123.53407112018034"));
                startActivity(intent);

                activityBG.setBackgroundResource(R.drawable.hermits_cove);

            }
        });

        vacaBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vacationName.setText("KAWASAN FALLS");

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:9.803733287614307, 123.37427785582312"));
                startActivity(intent);

                activityBG.setBackgroundResource(R.drawable.kawasan_falls);
            }
        });

        vacaBtn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vacationName.setText("OSLOB WHALE WATCHING");

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:9.463591712722252, 123.37976598291495"));
                startActivity(intent);

                activityBG.setBackgroundResource(R.drawable.oslob_whale_shark_watching);

            }
        });

        vacaBtn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vacationName.setText("SIRAO GARDEN");

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.406980493653744, 123.86684464059562"));
                startActivity(intent);

                activityBG.setBackgroundResource(R.drawable.sirao_garden);

            }
        });

        vacaBtn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                vacationName.setText("TOPS");

                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse("geo:10.371484434641442, 123.8708763446226"));
                startActivity(intent);

                activityBG.setBackgroundResource(R.drawable.tops_cebu);

            }
        });

    }

    public void initComponents(){
        vacationName = findViewById(R.id.vacationName);

        activityBG = findViewById(R.id.activityBG);

        vacaBtn1 = findViewById(R.id.vacaBtn1);
        vacaBtn2 = findViewById(R.id.vacaBtn2);
        vacaBtn3 = findViewById(R.id.vacaBtn3);
        vacaBtn4 = findViewById(R.id.vacaBtn4);
        vacaBtn5 = findViewById(R.id.vacaBtn5);
    }
}