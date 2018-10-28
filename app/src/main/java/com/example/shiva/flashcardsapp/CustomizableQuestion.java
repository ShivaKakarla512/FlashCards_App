package com.example.shiva.flashcardsapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class CustomizableQuestion extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_customizable_question);

        String s1 = getIntent().getStringExtra("stringDefault1"); // this string will be 'harry potter`
        String s2 = getIntent().getStringExtra("stringDefault2");
        String s3 = getIntent().getStringExtra("stringDefault3");
        String s4 = getIntent().getStringExtra("stringDefault4");
        String s5 = getIntent().getStringExtra("stringDefault5");

        if (s4.matches("")) {
            ((EditText) findViewById(R.id.wrong_answer2)).setHint("Enter Wrong Answer Here");
        }
        else {
            ((EditText) findViewById(R.id.wrong_answer2)).setHint(s4);
        }

        if (s5.matches("")) {
            ((EditText) findViewById(R.id.wrong_answer3)).setHint("Enter Wrong Answer Here");
        }
        else {
            ((EditText) findViewById(R.id.wrong_answer3)).setHint(s5);
        }

        ((EditText) findViewById(R.id.question)).setHint(s1);
        ((EditText) findViewById(R.id.correct_answer)).setHint(s2);
        ((EditText) findViewById(R.id.wrong_answer1)).setHint(s3);


        findViewById(R.id.save_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                EditText questionEditText = findViewById(R.id.question);
                String question = questionEditText.getText().toString();

                EditText answerEditText = findViewById(R.id.correct_answer);
                String answer = answerEditText.getText().toString();

                EditText answerEditText2 = findViewById(R.id.wrong_answer1);
                String answer2 = answerEditText2.getText().toString();

                EditText answerEditText3 = findViewById(R.id.wrong_answer2);
                String answer3 = answerEditText3.getText().toString();

                EditText answerEditText4 = findViewById(R.id.wrong_answer3);
                String answer4 = answerEditText4.getText().toString();


                if ((question.matches("")) || (answer.matches("")) || (answer2.matches(""))) {
                    Toast.makeText(getApplicationContext(), "Enter both a Question and two Answers!!!", Toast.LENGTH_SHORT).show();
                }
                else {
                    Intent data = new Intent(); // create a new Intent, this is where we will put our data
                    data.putExtra("string1", question); // puts one string into the Intent, with the key as 'string1'
                    data.putExtra("string2", answer); // puts another string into the Intent, with the key as 'string2
                    data.putExtra("string3", answer2);
                    data.putExtra("string4", answer3);
                    data.putExtra("string5", answer4);
                    setResult(RESULT_OK, data);
                    finish();
                }
            }
        });

        findViewById(R.id.cancel_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CustomizableQuestion.this, MainActivity.class);
                CustomizableQuestion.this.startActivity(intent);
            }
        });


    }

}
