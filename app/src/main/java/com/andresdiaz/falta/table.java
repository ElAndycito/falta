package com.andresdiaz.falta;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class table extends AppCompatActivity {
    Button backButtonTable;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);

        // Initialize the backButtonTable and set its click listener
        backButtonTable = findViewById(R.id.backButton2);
        backButtonTable.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Finish the current activity and return to the previous activity
                finish();
            }
        });
    }
}

