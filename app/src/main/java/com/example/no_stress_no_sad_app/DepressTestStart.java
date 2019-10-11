package com.example.no_stress_no_sad_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class DepressTestStart extends Activity {
    private Button btnStart;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depress_test_start);
        btnStart = findViewById(R.id.starto);
        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(DepressTestStart.this, DepressTestQuiz.class);
                startActivity(intent);
                finish();
            }
        });

    }
}
