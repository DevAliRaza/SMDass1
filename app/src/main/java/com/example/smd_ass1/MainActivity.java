package com.example.smd_ass1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {

    private EditText etFirstName, etLastName, etEmail, etPassword, etRetypePassword;
    private RadioGroup rgGender;
    private TextView tvLoginNow;
    private Button btnSignUp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etFirstName = findViewById(R.id.etFirstName);
        etLastName = findViewById(R.id.etLastName);
        etEmail = findViewById(R.id.etEmail);
        etPassword = findViewById(R.id.etPassword);
        etRetypePassword = findViewById(R.id.etRetypePassword);
        rgGender = findViewById(R.id.rgGender);
        tvLoginNow = findViewById(R.id.tvLoginNow);
        btnSignUp = findViewById(R.id.btnSignUp);
        findViewById(R.id.btnSignUp).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, SignupActivity.class);
                startActivity(intent);
            }
        });

        tvLoginNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Navigate to the Login Activity
               // Toast.makeText(SignupActivity.this, "Navigate to Login!", Toast.LENGTH_SHORT).show();
                // Intent intent = new Intent(SignupActivity.this, LoginActivity.class);
                // startActivity(intent);
            }
        });
    }



}
