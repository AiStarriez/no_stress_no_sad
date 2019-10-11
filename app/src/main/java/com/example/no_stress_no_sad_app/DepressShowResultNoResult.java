package com.example.no_stress_no_sad_app;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class DepressShowResultNoResult extends DepressTestTwoQ {

    protected TextView depressResultTopic, depressResultDescription;
    protected Button depressEncounter;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.depress_result_no_result);
        depressResultTopic = (TextView) findViewById(R.id.depress_results_topic_no_result);
        depressResultDescription = (TextView) findViewById(R.id.depress_results_description_no_result);
        depressEncounter = (Button) findViewById(R.id.depress_encounter);

        depressResultTopic.setText(myDepressResult.getdepressResultValue(0));
        depressResultDescription.setText(myDepressResult.getDepressResultDescription(0));
        depressEncounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });



    }
}
