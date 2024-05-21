package com.example.androidprojectcollection;

import androidx.annotation.ColorRes;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.Toast;

public class MenuExercise extends AppCompatActivity {

    Button btnChanger;
    GradientDrawable shape = new GradientDrawable();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu_exercise);

        btnChanger = findViewById(R.id.btnTransformingButton);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu){
        MenuInflater inflater = getMenuInflater();
        inflater.inflate(R.menu.menu_menu_exercise,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item){
        if (item.getItemId() == R.id.mItemChange){
            Toast.makeText(this, "Change Menu Opened", Toast.LENGTH_SHORT).show();
        }
        else if(item.getItemId() == R.id.menuItem1){
            Toast.makeText(this, "Changed Button's Background Color", Toast.LENGTH_SHORT).show();
            btnChanger.setBackground(shape);
            shape.setTint(Color.LTGRAY);
        }
        else if(item.getItemId() == R.id.menuItem2){
            Toast.makeText(this, "Changed Button's Text", Toast.LENGTH_SHORT).show();
            btnChanger.setText("Hello World");
        }
        else if(item.getItemId() == R.id.menuItem3){
            Toast.makeText(this, "Changed Button's Text Color", Toast.LENGTH_SHORT).show();
            btnChanger.setTextColor(Color.RED);
        }
        else if(item.getItemId() == R.id.menuItem4){
            Toast.makeText(this, "Change Button's Shape", Toast.LENGTH_SHORT).show();
            shape.setCornerRadius(1000);
            btnChanger.setBackground(shape);
        }
        else if(item.getItemId() == R.id.menuItem5){
            Toast.makeText(this, "Change Button's Rotation", Toast.LENGTH_SHORT).show();
            btnChanger.setRotation(40);
        }
        else if(item.getItemId() == R.id.mItemReset){
            Toast.makeText(this, "Button Resets", Toast.LENGTH_SHORT).show();
            btnChanger.setBackgroundColor(Color.parseColor("#141414"));
            btnChanger.setText("BUTTON");
            btnChanger.setTextColor(Color.WHITE);
            btnChanger.setTextSize(14);
            btnChanger.setRotation(0);
            shape.setCornerRadius(0);
            btnChanger.setBackground(shape);
        }
        else if(item.getItemId() == R.id.mItemExit){
            finish();
        }

        return true;
    }
}