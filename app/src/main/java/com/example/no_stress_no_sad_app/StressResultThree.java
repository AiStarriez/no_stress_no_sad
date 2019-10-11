package com.example.no_stress_no_sad_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import org.w3c.dom.Text;

public class StressResultThree extends StressResultOneAndTwo {
    protected Button stressContactInfo;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.stress_result_three);

        stressContactInfo = (Button) findViewById(R.id.stress_contactInfo);
        stressResultTopic = (TextView) findViewById(R.id.stress_results_topic_three);
        stressResultDescription = (TextView) findViewById(R.id.stress_results_description_three);

        if (stressScore > 41){
            userStressResult = myStressResult.getStressResultValue(2);
            myStressTestComponent.setResult(userStressResult);

            stressResultTopic.setText(myStressResult.getStressResultValue(2));
            stressResultDescription.setText(myStressResult.getStressResultDescription(2));
        }

        saveUserResults();
        stressContactInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
