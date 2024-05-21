package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class PassingIntentsExercise2 extends AppCompatActivity {

    TextView tFname, tLname, tGender, tBdate, tPnum, tEmail, tStatus, tNationality, tCourse, tLocation, tAge;

    Button btnReturn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise2);

        init();

        Intent intent = getIntent();

        String fname = intent.getStringExtra("fname_key");
        String lname = intent.getStringExtra("lname_key");

        String gender = intent.getStringExtra("gender_key");

        String bdate = intent.getStringExtra("bdate_key");
        String pnum = intent.getStringExtra("pnum_key");
        String email = intent.getStringExtra("eadd_key");

        String civil_status = intent.getStringExtra("civilstatus_key");
        String nationality = intent.getStringExtra("nationality_key");
        String course = intent.getStringExtra("course_key");
        String location = intent.getStringExtra("location_key");
        String age = intent.getStringExtra("age_key");

        tFname.setText(fname);
        tLname.setText(lname);

        tGender.setText(gender);

        tBdate.setText(bdate);
        tPnum.setText(pnum);
        tEmail.setText(email);

        tStatus.setText(civil_status);
        tNationality.setText(nationality);
        tCourse.setText(course);
        tLocation.setText(location);
        tAge.setText(age);

        btnReturn = (Button) findViewById(R.id.btnReturnProfile);

        btnReturn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onBackPressed();
            }
        });

    }

    public void init(){
        tFname = findViewById(R.id.txtPI2Fname);
        tLname = findViewById(R.id.txtPI2LName);
        tGender = findViewById(R.id.txtPI2Gender);
        tBdate = findViewById(R.id.txtPI2BDate);
        tPnum = findViewById(R.id.txtPI2Pnum);
        tEmail = findViewById(R.id.txtPI2Email);
        tStatus = findViewById(R.id.txtPI2Status);
        tNationality = findViewById(R.id.txtPI2Nationality);
        tCourse = findViewById(R.id.txtPI2Course);
        tLocation = findViewById(R.id.txtPI2Location);
        tAge = findViewById(R.id.txtPI2Age);
    }
}