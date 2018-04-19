package com.example.sdu.lgssp.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sdu.lgssp.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


    }

    public void login(View view) {
        startActivity(new Intent(LoginActivity.this, MainActivity.class));
    }

    public void registeAccout(View view) {
        startActivity(new Intent(LoginActivity.this, RegisterActivity.class));
    }
}
