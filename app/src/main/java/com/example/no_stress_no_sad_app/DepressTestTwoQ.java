package com.example.no_stress_no_sad_app;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import androidx.annotation.NonNull;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class DepressTestTwoQ extends DepressTestInit {


    public RadioGroup radioGroupTwoQOne, radioGroupTwoQTwo;
    public RadioButton radioTwoQOneYes, radioTwoQOneNo, radioTwoQTwoYes, radioTwoQTwoNo;
    public Button btnNext;

    //protected static String userDepressResult;
    protected DepressResults myDepressResult = new DepressResults();

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depress_test_two_q);

        radioGroupTwoQOne = (RadioGroup) findViewById(R.id.radioDepressTwoQOne);
        radioGroupTwoQTwo = (RadioGroup) findViewById(R.id.radioDepressTwoQTwo);

        radioTwoQOneYes = (RadioButton) findViewById(R.id.depressTwoQ1Yes);
        radioTwoQOneNo = (RadioButton) findViewById(R.id.depressTwoQ1No);
        radioTwoQTwoYes = (RadioButton) findViewById(R.id.depressTwoQ2Yes);
        radioTwoQTwoNo = (RadioButton) findViewById(R.id.depressTwoQ2No);

        btnNext = (Button) findViewById(R.id.btnNextQuestion) ;

        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int selectedTwoQOne = radioGroupTwoQOne.getCheckedRadioButtonId();
                int temp = 0;
                if(selectedTwoQOne == radioTwoQOneYes.getId()){
                    temp++;
                }

                int selectedTwoQTwo = radioGroupTwoQTwo.getCheckedRadioButtonId();
                if(selectedTwoQTwo == radioTwoQTwoYes.getId()){
                    temp++;
                }

                if(temp >= 1){
                    Intent intent = new Intent(DepressTestTwoQ.this, DepressTestStart.class);
                    startActivity(intent);


                } else if (temp == 0) {
                    Intent intent = new Intent(DepressTestTwoQ.this, DepressShowResultNoResult.class);
                    startActivity(intent);

                }

            }
        });
    }
}
