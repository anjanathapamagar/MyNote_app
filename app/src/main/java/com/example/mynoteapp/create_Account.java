package com.example.mynoteapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.Spanned;
import android.text.SpannedString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class create_Account extends AppCompatActivity {
    ImageView imageView;
    TextView txt1,txt2,txt3,txt4,txt5,txt6,txt7;
    EditText edit1,edit2,edit3;
    Button btm1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create__account);
        imageView = findViewById(R.id.imageView);
        txt1 = findViewById(R.id.txt1);
        txt2 = findViewById(R.id.txt2);
        txt3 = findViewById(R.id.txt3);
        txt4 = findViewById(R.id.txt4);
        txt5 = findViewById(R.id.txt5);
        txt6 = findViewById(R.id.txt6);
        txt7 = findViewById(R.id.txt7);

        edit1 = findViewById(R.id.edit1);
        edit2 = findViewById(R.id.edit2);
        edit3 = findViewById(R.id.edit3);
         btm1 = findViewById(R.id.btm1);




         String text = "Already have an account?Sign In";
         String text1 = "By signing up,you agree to MyNote Privacy and Terms";

        SpannableString ss = new SpannableString(text);
        SpannableString ss1 = new SpannableString(text1);





        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Intent intent = new Intent(create_Account.this,sign_in.class);
                startActivity(intent);
            }
        };

        ss.setSpan(clickableSpan1,24,31, Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt6.setText(ss);
        txt6.setMovementMethod(LinkMovementMethod.getInstance());

        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(@NonNull View view) {
                Toast.makeText(create_Account.this,"22222",Toast.LENGTH_SHORT).show();
            }
        };
        ss1.setSpan(clickableSpan2,34,41,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        ss1.setSpan(clickableSpan2,46,51,Spanned.SPAN_EXCLUSIVE_EXCLUSIVE);
        txt7.setText(ss1);
        txt7.setMovementMethod(LinkMovementMethod.getInstance());
    }

}