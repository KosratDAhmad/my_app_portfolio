package com.example.android.myappportfolio;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void displayMessage(View v){
        String text1 = "This button will launch my ";
        String text2 = " app!";
        String message= null;
        switch (v.getId()){
            case R.id.btn_proj1:
                message= text1 + getString(R.string.project1) +text2;
                Toast.makeText(this,message,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_proj2:
                message= text1 + getString(R.string.project2) +text2;
                Toast.makeText(this,message,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_proj3:
                message= text1 + getString(R.string.project3) +text2;
                Toast.makeText(this,message,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_proj4:
                message= text1 + getString(R.string.project4) +text2;
                Toast.makeText(this,message,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_proj5:
                message= text1 + getString(R.string.project5) +text2;
                Toast.makeText(this,message,Toast.LENGTH_LONG).show();
                break;
            case R.id.btn_proj6:
                message= text1 + getString(R.string.project6) +text2;
                Toast.makeText(this,message,Toast.LENGTH_LONG).show();
                break;
        }
    }
}
