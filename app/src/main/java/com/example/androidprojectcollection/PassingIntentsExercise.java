package com.example.androidprojectcollection;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

public class PassingIntentsExercise extends AppCompatActivity {

    EditText eFName, eLName, eBDate, eNum, eMail, eStatus, eNationality, eCourse, eLocation, eAge;

    RadioGroup radGroupGenders;
    RadioButton rMale, rFem, rOth;

    Button btnClear, btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_passing_intents_exercise);

        init();

        btnClear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                eFName.getText().clear();
                eLName.getText().clear();

                radGroupGenders.clearCheck();

                eBDate.getText().clear();
                eNum.getText().clear();
                eMail.getText().clear();

                // 5 additional informations

                eStatus.getText().clear();
                eNationality.getText().clear();
                eCourse.getText().clear();
                eLocation.getText().clear();
                eAge.getText().clear();

            }
        });

        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String fName = eFName.getText().toString();
                String lName = eLName.getText().toString();

                String gender;
                if(rMale.isChecked()){
                    gender = "Male";
                }
                else if(rFem.isChecked()){
                    gender = "Female";
                }
                else if(rOth.isChecked()){
                    gender = "Others";
                }
                else{
                    gender = "Unknown";
                }

                String bDate = eBDate.getText().toString();
                String pNumber = eNum.getText().toString();
                String emailAdd = eMail.getText().toString();

                String civilStatus = eStatus.getText().toString();
                String nationality = eNationality.getText().toString();
                String course = eCourse.getText().toString();
                String location = eLocation.getText().toString();
                String age = eAge.getText().toString();

                Intent intent = new Intent(PassingIntentsExercise.this, PassingIntentsExercise2.class);

                intent.putExtra("fname_key", fName);
                intent.putExtra("lname_key", lName);

                intent.putExtra("gender_key", gender);

                intent.putExtra("bdate_key", bDate);
                intent.putExtra("pnum_key", pNumber);
                intent.putExtra("eadd_key", emailAdd);

                intent.putExtra("civilstatus_key", civilStatus);
                intent.putExtra("nationality_key", nationality);
                intent.putExtra("course_key", course);
                intent.putExtra("location_key", location);
                intent.putExtra("age_key", age);

                startActivity(intent);

            }
        });

    }

    public void init(){
        eFName = findViewById(R.id.etxtFName);
        eLName = findViewById(R.id.etxtLName);

        radGroupGenders = findViewById(R.id.radGroupGenders);

        rMale = findViewById(R.id.radMale);
        rFem = findViewById(R.id.radFemale);
        rOth = findViewById(R.id.radOthers);

        eBDate = findViewById(R.id.etxtBdate);
        eNum = findViewById(R.id.etxtPhoneNumber);
        eMail = findViewById(R.id.etxtEmailAdd);

        // 5 Additional Informations
        eStatus = findViewById(R.id.etxtCivilStatus);
        eNationality = findViewById(R.id.etxtNationality);
        eCourse = findViewById(R.id.etxtCourse);
        eLocation = findViewById(R.id.etxtLocation);
        eAge = findViewById(R.id.etxtAge);

        btnClear = findViewById(R.id.btnPIClear);
        btnSubmit = findViewById(R.id.btnPISubmit);
    }
}