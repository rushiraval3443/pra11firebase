package com.example.pra10;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2 extends AppCompatActivity {
TextView tv_username,tv_password,tv_email,tv_phone,tv_country,tv_state;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main2);
        tv_username=findViewById(R.id.tv_username);
        tv_password=findViewById(R.id.tv_pass);
        tv_email=findViewById(R.id.tv_email);
        tv_phone=findViewById(R.id.tv_phone);
        tv_country=findViewById(R.id.tv_country);
        tv_state=findViewById(R.id.tv_state);
        Intent i = getIntent();
        tv_username.setText(i.getStringExtra("username"));
        tv_password.setText(i.getStringExtra("password"));
        tv_email.setText(i.getStringExtra("email"));
        tv_phone.setText(i.getStringExtra("phone"));
        tv_country.setText(i.getStringExtra("country"));
        tv_state.setText(i.getStringExtra("state"));
    }
}