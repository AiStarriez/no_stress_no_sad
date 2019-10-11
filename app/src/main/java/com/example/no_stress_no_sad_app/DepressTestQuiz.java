package com.example.no_stress_no_sad_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class DepressTestQuiz extends DepressTestTwoQ {
    protected TextView depressQuestion;
    protected RadioGroup depressAnswerGroup;
    protected RadioButton radioNever, radioSometimes, radioUsually, radioEveryday, button;
    public Button btnNext;
    protected DepressQuestions myDepressQuestion = new DepressQuestions();
    public static int depressScore = 0;
    public int temp = 1;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depress_test_quiz);
        depressAnswerGroup = (RadioGroup) findViewById(R.id.depressAnswerGroup) ;
        radioNever = (RadioButton) findViewById(R.id.depressTestNever);
        radioSometimes = (RadioButton) findViewById(R.id.depressTestSometimes);
        radioUsually = (RadioButton) findViewById(R.id.depressTestUsually);
        radioEveryday = (RadioButton) findViewById(R.id.depressTestAlways);
        depressQuestion = (TextView) findViewById(R.id.depressQuestion);

        //updateQuestion(0);
        depressQuestion.setText(myDepressQuestion.getDepressQuestion(0));

        btnNext = (Button) findViewById(R.id.btnNextQuestion);
        btnNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // get selected radio button from radioGroup
                int selectedId = depressAnswerGroup.getCheckedRadioButtonId();

                // find the radiobutton by returned id

                if (temp <= 8) {
                    if (selectedId == radioNever.getId()) {
                        depressScore += 0;
                        updateQuestion(temp);
                        depressAnswerGroup.clearCheck();
                    }
                    if (selectedId == radioSometimes.getId()) {
                        depressScore += 1;
                        updateQuestion(temp);
                        depressAnswerGroup.clearCheck();
                    }
                    if (selectedId == radioUsually.getId()) {
                        depressScore += 2;
                        updateQuestion(temp);
                        depressAnswerGroup.clearCheck();
                    }
                    if (selectedId == radioEveryday.getId()) {
                        depressScore += 3;
                        updateQuestion(temp);
                        depressAnswerGroup.clearCheck();
                    }
                    temp++;
                }
                else {
                    //button  = findViewById(selectedId);
                    if (selectedId == radioNever.getId()) {
                        depressScore += 0;
                    }
                    if (selectedId == radioSometimes.getId()) {
                        depressScore += 1;
                    }
                    if (selectedId == radioUsually.getId()) {
                        depressScore += 2;
                    }
                    if (selectedId == radioEveryday.getId()) {
                        depressScore += 3;
                    }
                    myDepressTestComponent.setScore(depressScore);
                    //Toast.makeText(StressTestQuiz.this, myStressTestComponent.getGender() + "," + myStressTestComponent.getFaculty() + "," + myStressTestComponent.getAge() + "," + myStressTestComponent.getScore()
                    //       , Toast.LENGTH_SHORT).show();
                    //finish();
                    Toast.makeText(DepressTestQuiz.this, myDepressTestComponent.getGender() + "," + myDepressTestComponent.getFaculty() + "," + myDepressTestComponent.getAge() + "," + myDepressTestComponent.getScore()
                            , Toast.LENGTH_SHORT).show();
                    Intent intent = new Intent(DepressTestQuiz.this, DepressShowResult.class);
                    startActivity(intent);
                    finish();
                }

            }
        });
    }

    private void updateQuestion(int num){
        depressQuestion.setText(myDepressQuestion.getDepressQuestion(num));
    }

  /*  public void getQuestions() {
        stressQuestionsSource.get()
                .addOnSuccessListener(new OnSuccessListener<DocumentSnapshot>() {
                    @Override
                    public void onSuccess(DocumentSnapshot documentSnapshot) {
                        if(documentSnapshot.exists()){
                            String questionId = documentSnapshot.getString("id");
                            String question = documentSnapshot.getString("value");
                            //Map<String, Object> stressQuestion = documentSnapshot.getData();
                            Toast.makeText(StressTestQuiz.this, questionId, Toast.LENGTH_SHORT).show();
                            stressQuestion.setText(question);

                        } else {
                            Toast.makeText(StressTestQuiz.this, "No questions", Toast.LENGTH_SHORT).show();
                        }
                    }
                })
                .addOnFailureListener(new onFailureListener() {
                    public void onFailure(@NonNull Exception e) {
                        Toast.makeText(StressTestQuiz.this, "Error!", Toast.LENGTH_SHORT).show();
                        Log.d(TAG, e.toString());

                    }
                });
    }*/





}