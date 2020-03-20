package com.example.quizapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioGroup;

public class QuizActivity extends Activity {
    private Button submitButton;
    private int score;

    private RadioGroup numOneRadionGroup;
    private RadioGroup numTwoRadionGroup;
    private RadioGroup numFiveRadionGroup;

    private EditText editText;

    private CheckBox excelCheckbox;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        submitButton = findViewById(R.id.submit_button);
        editText = findViewById(R.id.edit_text);

        excelCheckbox = findViewById(R.id.excel_checkbox);

        numOneRadionGroup = findViewById(R.id.num_one_radio_group);
        numTwoRadionGroup = findViewById(R.id.num_two_radio_group);
        numFiveRadionGroup = findViewById(R.id.num_five_radio_group);

        submitButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                score = 0;
                if(numOneRadionGroup.getCheckedRadioButtonId() == R.id.a_radio){
                    score += 1;
                }
                if(numTwoRadionGroup.getCheckedRadioButtonId() == R.id.three_radio){
                    score += 1;
                }
                if(numFiveRadionGroup.getCheckedRadioButtonId() == R.id.mail_radio){
                    score += 1;
                }
                String userAnswer = editText.getText().toString();
                if(userAnswer.equalsIgnoreCase("Unix")){
                    score += 1;
                }
                if(excelCheckbox.isChecked() ){
                    score += 1;
                }
                Intent intent = new Intent(QuizActivity.this, ScoreActivity.class);

                intent.putExtra("SCORE", score+"/5");

                startActivity(intent);
            }
        });
    }
}

