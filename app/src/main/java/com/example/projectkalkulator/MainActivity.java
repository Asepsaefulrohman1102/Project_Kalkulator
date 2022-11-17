package com.example.projectkalkulator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText angka01,angka02;
    Button button,buttonK,buttonKl,buttonbg;
    TextView hasil;
    int tampung;
    double tampungbg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        angka01=findViewById(R.id.angka1);
        angka02=findViewById(R.id.angka2);
        hasil=findViewById(R.id.hasil);
        button=findViewById(R.id.tbltambah);
        buttonK=findViewById(R.id.tblkurang);
        buttonKl=findViewById(R.id.tblkali);
        buttonbg=findViewById(R.id.tblbagi);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1=Integer.parseInt(angka01.getText().toString());
                int angka2=Integer.parseInt(angka02.getText().toString());
                tampung=(angka1+angka2);

                hasil.setText(Integer.toString(tampung));
            }
        });

        buttonK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1=Integer.parseInt(angka01.getText().toString());
                int angka2=Integer.parseInt(angka02.getText().toString());
                tampung=(angka1-angka2);

                hasil.setText(Integer.toString(tampung));
            }
        });

        buttonKl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1=Integer.parseInt(angka01.getText().toString());
                int angka2=Integer.parseInt(angka02.getText().toString());
                tampung=(angka1*angka2);

                hasil.setText(Integer.toString(tampung));
            }
        });

        buttonbg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int angka1=Integer.parseInt(angka01.getText().toString());
                int angka2=Integer.parseInt(angka02.getText().toString());
                tampungbg=(angka1/angka2);

                hasil.setText(Double.toString(tampungbg));
            }
        });

    }
}