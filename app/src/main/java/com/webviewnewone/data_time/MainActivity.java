package com.webviewnewone.data_time;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Calendar;
import java.util.Date;

public class MainActivity extends AppCompatActivity {
Button clickbtn;
TextView texttime;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        clickbtn=findViewById(R.id.clickbtn);
        texttime=findViewById(R.id.texttime);

        clickbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Date dateCurrent= Calendar.getInstance().getTime();
                texttime.setText(dateCurrent.toString());
            }
        });
    }
}