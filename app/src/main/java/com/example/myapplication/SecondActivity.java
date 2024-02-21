package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
Button button;
TextView textView,textView2,textView3,textView4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        Intent intent = getIntent();
        button = findViewById(R.id.btn2);
        textView = findViewById(R.id.TextView);
        textView2 = findViewById(R.id.TextView2);
        textView3 = findViewById(R.id.TextView3);
        textView4 = findViewById(R.id.TextView4);

        String receivedText = intent.getStringExtra("Surame_ma");
        String receivedText2 = intent.getStringExtra("Name_ma");
        String receivedText3 = intent.getStringExtra("Otche_ma");
        String receivedText4 = intent.getStringExtra("Age_ma");

        textView.setText(receivedText);
        textView2.setText(receivedText2);
        textView3.setText(receivedText3);
        textView4.setText(receivedText4);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(SecondActivity.this,MainActivity.class);
                startActivity(intent1);
            }
        });

    }
}