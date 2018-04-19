package com.example.sdu.lgssp.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.sdu.lgssp.R;

public class ForgetPWActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_pw);
    }

    public void forgetPW(View view) {
        finish();
    }
}
