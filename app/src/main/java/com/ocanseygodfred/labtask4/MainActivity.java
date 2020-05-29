package com.ocanseygodfred.labtask4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button button;
    static EditText editText;
   static EditText editText2;
   static EditText editText3;
    EditText editText4;

    public  static Calculations calculations;

    public static final  String SharePref="SharedPrefs";
    public static final  String SharePref2="SharedPrefs2";
    public static final  String SharePref3="SharedPrefs3";
    public static final  String SharePref4="SharedPrefs4";


    public static final String TEXTSAVED_MONTH="text";
    public static final String TEXTSAVED_DP="text";
    public static final String TEXTSAVED_LR="text";
    public static final String TEXTSAVED_CV="text";

    public static String TEXTRETRIEVE_MONTH="";
    public static String TEXTRETRIEVE_DP="";
    public static String TEXTRETRIEVE_LR="";
    public static String TEXTRETRIEVE_CV="";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button=(Button)findViewById(R.id.button);
        editText=(EditText)findViewById(R.id.editText);
        editText2=(EditText)findViewById(R.id.editText2);
        editText3=(EditText)findViewById(R.id.editText3);
        editText4=(EditText)findViewById(R.id.editText4);

        calculations=new Calculations();



        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                nextactivity();


                saveData();
                saveData2();
                saveData3();
                saveData4();
                calculations.calc();

                 }
        });

        loadData();
        loadData2();
        loadData3();
        loadData4();

        UpdateView();


    }





    public void nextactivity(){

        Intent intent= new Intent(this, Main2Activity.class);
        startActivity(intent);
        overridePendingTransition(R.anim.to_next, 0);


    }


    public void saveData(){
        SharedPreferences sharedPreferences= getSharedPreferences(SharePref,MODE_PRIVATE);
         SharedPreferences.Editor editor= sharedPreferences.edit();
        editor.putString(TEXTSAVED_MONTH,editText.getText().toString());
        editor.apply();

    }

    public void saveData2(){
        SharedPreferences sharedPreferences2= getSharedPreferences(SharePref2,MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences2.edit();
        editor.putString(TEXTSAVED_DP,editText2.getText().toString());
        editor.apply();

    }

    public void saveData3(){
        SharedPreferences sharedPreferences3= getSharedPreferences(SharePref3,MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences3.edit();
        editor.putString(TEXTSAVED_LR,editText3.getText().toString());
        editor.apply();

    }

    public void saveData4(){
        SharedPreferences sharedPreferences4= getSharedPreferences(SharePref4,MODE_PRIVATE);
        SharedPreferences.Editor editor= sharedPreferences4.edit();
        editor.putString(TEXTSAVED_CV,editText4.getText().toString());
        editor.apply();

    }



    public void loadData(){
        SharedPreferences sharedPreferences= getSharedPreferences(SharePref, MODE_PRIVATE);
        TEXTRETRIEVE_MONTH=sharedPreferences.getString(TEXTSAVED_MONTH,"");
    }

    public void loadData2(){
        SharedPreferences sharedPreferences2= getSharedPreferences(SharePref2, MODE_PRIVATE);
        TEXTRETRIEVE_DP=sharedPreferences2.getString(TEXTSAVED_DP,"");
    }

    public void loadData3(){
        SharedPreferences sharedPreferences3= getSharedPreferences(SharePref3, MODE_PRIVATE);
        TEXTRETRIEVE_LR=sharedPreferences3.getString(TEXTSAVED_LR,"");
    }

    public void loadData4(){
        SharedPreferences sharedPreferences4= getSharedPreferences(SharePref4, MODE_PRIVATE);
        TEXTRETRIEVE_CV=sharedPreferences4.getString(TEXTSAVED_CV,"");
    }

    public void UpdateView(){
        editText.setText(TEXTRETRIEVE_MONTH);
        editText2.setText(TEXTRETRIEVE_DP);
        editText3.setText(TEXTRETRIEVE_LR);
        editText4.setText(TEXTRETRIEVE_CV);
    }



}
