package com.andresdiaz.falta;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class calendar2 extends AppCompatActivity {
    Button backButtonCal;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar2);

        // Initialize the backButton and set its click listener inside onCreate
        backButtonCal = findViewById(R.id.backButton1);
        backButtonCal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // finish the 2nd act. and return
                finish();
            }
        });
    }
}
