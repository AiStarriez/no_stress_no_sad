package com.example.no_stress_no_sad_app;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

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


            Toast.makeText(StressResultThree.this, "Hey it's me :D", Toast.LENGTH_SHORT).show();
            userStressResult = myStressResult.getStressResultValue(2);
            myStressTestComponent.setResult(userStressResult);

            stressResultTopic.setText(myStressResult.getStressResultValue(2));
            stressResultDescription.setText(myStressResult.getStressResultDescription(2));


        saveUserResults();
        stressScore = 0;
        stressContactInfo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent contactintent = new Intent(StressResultThree.this, Contact.class);
                startActivity(contactintent);
                stressScore = 0;
                finish();


            }
        });
        stressEncounter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent coping = new Intent(StressResultThree.this, Coping.class);
                startActivity(coping);
                stressScore = 0;
                finish();

            }
        });

    }
}
