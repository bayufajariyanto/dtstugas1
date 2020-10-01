package com.bayufajariyanto.slider;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }

    public void clickResetPassword(View view) {
        Intent intent = new Intent(ForgotPassword.this, ResetPassword.class);
        startActivity(intent);
    }
}