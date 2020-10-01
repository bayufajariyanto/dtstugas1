package com.bayufajariyanto.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class WelcomeBack extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome_back);
    }

    public void clickForgotPassword(View view) {
        Intent intent = new Intent(WelcomeBack.this, ForgotPassword.class);
        startActivity(intent);
    }

    public void clickSuccess(View view) {
        Intent intent = new Intent(WelcomeBack.this, SuccessActivity.class);
        startActivity(intent);
    }
}