package com.example.no_stress_no_sad_app;

import android.os.Bundle;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

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
    }
}
