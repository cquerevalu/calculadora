package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button btn_suma;
    private Button btn_res;
    private Button btn_divi;
    private Button btn_mult;

    private TextView txt_resp;

    private EditText text_n1;
    private EditText text_n2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txt_resp = findViewById(R.id.txt_res);
        text_n1 = findViewById(R.id.ptxt_n1);
        text_n2 = findViewById(R.id.ptxt_n2);

        btn_suma = findViewById(R.id.btn_sum);
        btn_suma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_resp.setText(
                        suma (Integer.parseInt(text_n1.getText().toString()),Integer.parseInt(text_n2.getText().toString()) )+"");
            }
        });


        btn_res = findViewById(R.id.btn_rest);
        btn_res.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               txt_resp.setText(
                       resta ( Integer.parseInt(text_n1.getText().toString()), Integer.parseInt(text_n2.getText().toString()) )+ "" );

            }
        });


        btn_divi = findViewById(R.id.btn_div);
        btn_divi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_resp.setText(
                        divi ( Integer.parseInt(text_n1.getText().toString()), Integer.parseInt(text_n2.getText().toString()) )+ "" );
            }
        });


        btn_mult = findViewById(R.id.btn_mul);
        btn_mult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txt_resp.setText(
                        multi ( Integer.parseInt(text_n1.getText().toString()), Integer.parseInt(text_n2.getText().toString()) )+ "" );
            }
        });


    }

    public double suma (int a, int b){
        return a + b;
    }

    public double resta (int a, int b){
        return a - b;
    }

    public double divi (int a, int b){
        int r = 0;
        if (b!=0) {
            r = a / b;
        }
        return r;


    }

    public double multi (int a, int b){

        return a / b;

    }



}