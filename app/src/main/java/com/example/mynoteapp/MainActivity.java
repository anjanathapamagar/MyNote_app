package com.example.mynoteapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    ImageView imageView, imageview5;
    TextView txt1;
    Button btm1, btm2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = findViewById(R.id.imageView);
        btm1 = findViewById(R.id.btm1);
        btm2 = findViewById(R.id.btm2);
        imageview5 = findViewById(R.id.imageView5);
        txt1 = findViewById(R.id.txt1);
        btm1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this,create_Account.class);
                startActivity(intent);

            }
        });
    }
}