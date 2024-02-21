package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn;
    EditText editText,editText2,editText3,editText4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = findViewById(R.id.btn);
        editText = findViewById(R.id.EditText);
        editText2 = findViewById(R.id.EditText2);
        editText3 = findViewById(R.id.EditText3);
        editText4 = findViewById(R.id.EditText4);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this,SecondActivity.class);

                String surname = editText.getText().toString();
                intent.putExtra("Surame_ma",surname);
                String name = editText2.getText().toString();
                intent.putExtra("Name_ma",name);
                String otche = editText3.getText().toString();
                intent.putExtra("Otche_ma",otche);
                String age = editText4.getText().toString();
                intent.putExtra("Age_ma",age);
                startActivity(intent);

            }
        });

    }

}