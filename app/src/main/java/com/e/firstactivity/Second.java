package com.e.firstactivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.firstactivity.R;

public class Second extends AppCompatActivity {

    float result;
    int num1, num2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        int number1 = intent.getIntExtra(com.e.firstactivity.MainActivity.EXTRA_NUMBER, 0);
        int number2 = intent.getIntExtra(com.e.firstactivity.MainActivity.EXTRA_NUMBER2, 0);

        final TextView textView = findViewById(R.id.no_f);
        final TextView textView2 = findViewById(R.id.no_s);
        textView.setText("" + number1);
        textView2.setText("" + number2);
        final TextView sum = findViewById(R.id.sum);
        Button add = findViewById(R.id.add);
        Button subtract = findViewById(R.id.subtract);
        Button multiply = findViewById(R.id.multiply);
        Button divde = findViewById(R.id.divde);

        add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(textView.getText().toString());
                num2 = Integer.parseInt(textView2.getText().toString());
                result= num1+num2;
                sum.setText(String.valueOf(result));
            }
        });

        subtract.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(textView.getText().toString());
                num2 = Integer.parseInt(textView2.getText().toString());
                result= num1-num2;
                sum.setText(String.valueOf(result));
            }
        });

        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(textView.getText().toString());
                num2 = Integer.parseInt(textView2.getText().toString());
                result= num1*num2;
                sum.setText(String.valueOf(result));
            }
        });

        divde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num1 = Integer.parseInt(textView.getText().toString());
                num2 = Integer.parseInt(textView2.getText().toString());
                result= num1/num2;
                sum.setText(String.valueOf(result));
            }
        });


    }
}