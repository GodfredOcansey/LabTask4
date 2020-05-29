package com.ocanseygodfred.labtask4;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

        Button back;
        TextView textView6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back=(Button)findViewById(R.id.back);
        textView6=(TextView)findViewById(R.id.textView6);


        textView6.setText("GHc"+Calculations.monthlyInstall.toString());


        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                prev_activity();
            }
        });

    }

    private void prev_activity() {
    Intent intent= new Intent(this, MainActivity.class);
    startActivity(intent);
    overridePendingTransition(R.anim.to_prev, 0);
    }
}
