package com.example.se_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView signup = findViewById(R.id.signup);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void setSignup(View view) {
     signup.setOnClickListener(
             new View.OnClickListener() {
                 @Override
                 public void onClick(View v) {
                   //  Intent intent=new Intent(".signUpActivity");
                   //  startActivity(intent);
                 }
             }
     );
    }
}