package com.example.qvansinsurance;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class login extends AppCompatActivity {
    EditText user_name,password,email;
    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user_name=findViewById(R.id.et_user_name);
        password=findViewById(R.id.et_password);
        email=findViewById(R.id.et_email);
        login=findViewById(R.id.btn_login);
    }
}