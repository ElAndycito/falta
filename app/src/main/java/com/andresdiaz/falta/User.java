package com.andresdiaz.falta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class User extends AppCompatActivity {
Button backButtonUser;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user);
        // Initialize the backButton and set its click listener inside onCreate
        backButtonUser = findViewById(R.id.backButton1);
        backButtonUser.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // finish the 2nd act. and return
                finish();
            }
        });
    }

}