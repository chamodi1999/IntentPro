package com.e.firstactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.firstactivity.R;

public class MainActivity extends AppCompatActivity {


    public static final String EXTRA_NUMBER = "com.example.application.example.EXTRA_NUMBER";
    public static final String EXTRA_NUMBER2 = "com.example.application.example.EXTRA_NUMBER2";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Context context =getApplicationContext();
                CharSequence text = "Navigating to Activity 2";
                int duration = Toast.LENGTH_SHORT;
                Toast toast = Toast.makeText(context, text, duration);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0,0);
                toast.show();

                openActivity2();

            }
        });
    }



    public void openActivity2() {
        EditText editText1 =  findViewById(R.id.no_fa);

        EditText editText2 =  findViewById(R.id.no_se);

        int number1 = Integer.parseInt(editText1.getText().toString());
        int number2 = Integer.parseInt(editText2.getText().toString());

        Intent intent = new Intent(this, Second.class);


        intent.putExtra(EXTRA_NUMBER, number1);
        intent.putExtra(EXTRA_NUMBER2, number2);
        startActivity(intent);
    }
}