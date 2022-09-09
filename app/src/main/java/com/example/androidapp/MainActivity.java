package com.example.androidapp;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;


public class MainActivity extends AppCompatActivity {
    public TextView textView4;
    public TextView textView3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        textView4 = (TextView) findViewById(R.id.textView4);

        textView4.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
           Intent intent = new Intent(MainActivity.this, Registration.class);
           startActivity(intent);
        }
        });

        textView3 = (TextView) findViewById(R.id.textView3);

        textView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View a) {
                Intent intent = new Intent(MainActivity.this, forget_password.class);
                startActivity(intent);
            }
        });
    }
}
