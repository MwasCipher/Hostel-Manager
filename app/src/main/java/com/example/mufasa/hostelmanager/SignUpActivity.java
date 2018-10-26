package com.example.mufasa.hostelmanager;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Button signUpButton = findViewById(R.id.signUpBtn);
        signUpButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(SignUpActivity.this, "You Have Signed Up Successfully", Toast.LENGTH_LONG).show();
                Intent backToLogIn = new Intent(SignUpActivity.this, MainActivity.class);
                backToLogIn.putExtra("new member", "registered new user");
                startActivity(backToLogIn);
            }
        });
    }
}
