package com.example.qvansinsurance;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class signup extends AppCompatActivity {
    EditText first_name,second_name,email,phone_number;
    Button submit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup2);
        first_name=findViewById(R.id.et_first_name);
        second_name=findViewById(R.id.et_second_name);
        email=findViewById(R.id.et_email);
        phone_number=findViewById(R.id.et_phone_number);
        submit=findViewById(R.id.btn_submit);
    }
}








