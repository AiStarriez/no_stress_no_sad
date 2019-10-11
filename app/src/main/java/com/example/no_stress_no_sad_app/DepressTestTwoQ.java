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
    // firebase firestore things
    private FirebaseFirestore db = FirebaseFirestore.getInstance();
    private static final String KEY_GENDER = "gender";
    private static final String KEY_FACULTY = "faculty";
    private static final String KEY_AGE = "age";
    private static final String KEY_RESULT = "result";
    private static final String KEY_SCORE = "score";

    public RadioGroup radioGroupTwoQOne, radioGroupTwoQTwo;
    public RadioButton radioTwoQOneYes, radioTwoQOneNo, radioTwoQTwoYes, radioTwoQTwoNo;
    public Button btnNext;

    protected static String userDepressResult;
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


                } else if (temp == 0) {
                    userDepressResult = myDepressResult.getdepressResultValue(0);
                    myDepressTestComponent.setResult(userDepressResult);
                    saveUserResults();
                    Intent intent = new Intent(DepressTestTwoQ.this, DepressShowResultNoResult.class);
                    startActivity(intent);

                }

            }
        });
    }
    public void saveUserResults() {
        Map<String, Object> userResult = new HashMap<>();
        userResult.put(KEY_GENDER, myDepressTestComponent.getGender());
        userResult.put(KEY_FACULTY, myDepressTestComponent.getFaculty());
        userResult.put(KEY_AGE, myDepressTestComponent.getAge());
        userResult.put(KEY_SCORE, myDepressTestComponent.getScore());
        userResult.put(KEY_RESULT, myDepressTestComponent.getResult());

        Long tsLong = System.currentTimeMillis()/1000;
        String ts = tsLong.toString();
        db.collection("depressResultTwoQFroemUser").document("user"+ ts).set(userResult)
                .addOnSuccessListener(new OnSuccessListener<Void>() {
                    @Override
                    public void onSuccess(Void aVoid) {

                    }
                })
                .addOnFailureListener(new OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception e) {

                    }
                });
    }
}
