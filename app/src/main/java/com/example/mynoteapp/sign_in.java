package com.example.mynoteapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class sign_in extends AppCompatActivity {
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7,txt8;
    EditText edit1,edit2;
    Button btm1,btm2;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        imageView = findViewById(R.id.imageView);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        txt7 = findViewById(R.id.txt7);
        txt8 = findViewById(R.id.txt8);
        btm1 = findViewById(R.id.btm1);
        btm2 = findViewById(R.id.btm2);


        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);

        String text = "Forget Password?";
        String text1 = "Privacy";
        String text2 = "Terms";

        SpannableString ss = new SpannableString(text);
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Toast.makeText(sign_in.this,"clicked",Toast.LENGTH_SHORT).show();

            }
        };

        ss.setSpan(clickableSpan,0,16, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt5.setText(ss);
        txt5.setMovementMethod(LinkMovementMethod.getInstance());


        SpannableString ss1 = new SpannableString(text1);
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Toast.makeText(sign_in.this,"clicked",Toast.LENGTH_SHORT).show();

            }
        };

        ss1.setSpan(clickableSpan1,0,7, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt7.setText(ss1);
        txt7.setMovementMethod(LinkMovementMethod.getInstance());


        SpannableString ss2 = new SpannableString(text2);
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
               Intent intent = new Intent(sign_in.this,Home.class);
               startActivity(intent);

            }
        };

        ss2.setSpan(clickableSpan2,0,5, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt8.setText(ss2);
        txt8.setMovementMethod(LinkMovementMethod.getInstance());


    }
}


