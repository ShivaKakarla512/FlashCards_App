package com.example.shiva.flashcardsapp;

import android.content.Intent;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        findViewById(R.id.flashcard_question).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.flashcard_answer)).setVisibility(View.VISIBLE);
                (findViewById(R.id.flashcard_question)).setVisibility(View.GONE);
            }
        });

        findViewById(R.id.flashcard_answer).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.flashcard_question)).setVisibility(View.VISIBLE);
                (findViewById(R.id.flashcard_answer)).setVisibility(View.GONE);
            }
        });

        findViewById(R.id.answer_choice_1).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.answer_choice_1)).setBackgroundColor(getResources().getColor(R.color.Green));
            }
        });

        findViewById(R.id.answer_choice_2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.answer_choice_2)).setBackgroundColor(getResources().getColor(R.color.Red));
                (findViewById(R.id.answer_choice_1)).setBackgroundColor(getResources().getColor(R.color.Green));
            }
        });

        findViewById(R.id.answer_choice_3).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.answer_choice_1)).setBackgroundColor(getResources().getColor(R.color.Green));
                (findViewById(R.id.answer_choice_3)).setBackgroundColor(getResources().getColor(R.color.Red));
            }
        });

        findViewById(R.id.answer_choice_4).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.answer_choice_4)).setBackgroundColor(getResources().getColor(R.color.Red));
                (findViewById(R.id.answer_choice_1)).setBackgroundColor(getResources().getColor(R.color.Green));
            }
        });

        findViewById(R.id.main).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.answer_choice_4)).setBackgroundColor(getResources().getColor(R.color.Grey));
                (findViewById(R.id.answer_choice_3)).setBackgroundColor(getResources().getColor(R.color.Grey));
                (findViewById(R.id.answer_choice_2)).setBackgroundColor(getResources().getColor(R.color.Grey));
                (findViewById(R.id.answer_choice_1)).setBackgroundColor(getResources().getColor(R.color.Grey));
            }
        });

        findViewById(R.id.view_answer_choices).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                TextView wrongAnswer3 = findViewById(R.id.answer_choice_4);
                String answer3 = wrongAnswer3.getText().toString();

                if ((answer3.matches(""))) {
                    wrongAnswer3.setVisibility(View.GONE);
                }
                else {
                    wrongAnswer3.setVisibility(View.VISIBLE);
                }

                TextView wrongAnswer1 = findViewById(R.id.answer_choice_1);
                String answer1 = wrongAnswer1.getText().toString();

                if ((answer1.matches(""))) {
                    wrongAnswer1.setVisibility(View.GONE);
                }
                else {
                    wrongAnswer1.setVisibility(View.VISIBLE);
                }

                TextView wrongAnswer2 = findViewById(R.id.answer_choice_3);
                String answer2 = wrongAnswer2.getText().toString();

                if ((answer2.matches(""))) {
                    wrongAnswer2.setVisibility(View.GONE);
                }
                else {
                    wrongAnswer2.setVisibility(View.VISIBLE);
                }

                (findViewById(R.id.answer_choice_2)).setVisibility(View.VISIBLE);
                (findViewById(R.id.hide_answer_choices)).setVisibility(View.VISIBLE);
                (findViewById(R.id.view_answer_choices)).setVisibility(View.GONE);

            }
        });

        findViewById(R.id.hide_answer_choices).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.answer_choice_4)).setVisibility(View.GONE);
                (findViewById(R.id.answer_choice_3)).setVisibility(View.GONE);
                (findViewById(R.id.answer_choice_2)).setVisibility(View.GONE);
                (findViewById(R.id.answer_choice_1)).setVisibility(View.GONE);
                (findViewById(R.id.hide_answer_choices)).setVisibility(View.GONE);
                (findViewById(R.id.view_answer_choices)).setVisibility(View.VISIBLE);
            }
        });

        findViewById(R.id.add_question).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, CustomizableQuestion.class);
                intent.putExtra("stringDefault1", "Enter The Question Here");
                intent.putExtra("stringDefault2", "Enter The Correct Answer Here");
                intent.putExtra("stringDefault3", "Enter The Wrong Answer Here");
                intent.putExtra("stringDefault4", "Enter The Wrong Answer Here");
                intent.putExtra("stringDefault5", "Enter The Wrong Answer Here");
                MainActivity.this.startActivityForResult(intent, 100);
            }
        });

        findViewById(R.id.edit_button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent2 = new Intent(MainActivity.this, CustomizableQuestion.class);
                intent2.putExtra("stringDefault1", ((TextView) findViewById(R.id.flashcard_question)).getText().toString());
                intent2.putExtra("stringDefault2", ((TextView) findViewById(R.id.flashcard_answer)).getText().toString());
                intent2.putExtra("stringDefault3", ((TextView) findViewById(R.id.answer_choice_2)).getText().toString());
                intent2.putExtra("stringDefault4", ((TextView) findViewById(R.id.answer_choice_3)).getText().toString());
                intent2.putExtra("stringDefault5", ((TextView) findViewById(R.id.answer_choice_4)).getText().toString());
                MainActivity.this.startActivityForResult(intent2, 100);
            }
        });

    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == 100) { // this 100 needs to match the 100 we used when we called startActivityForResult!
            String string1 = data.getExtras().getString("string1"); // 'string1' needs to match the key we used when we put the string in the Intent
            String string2 = data.getExtras().getString("string2");
            String string3 = data.getExtras().getString("string3");
            String string4 = data.getExtras().getString("string4");
            String string5 = data.getExtras().getString("string5");


            final CoordinatorLayout coordinatorLayout = findViewById(R.id.c_layout);
            Snackbar.make(coordinatorLayout, "Flashcard Successfully Created!", Snackbar.LENGTH_LONG).show();

            ((TextView) findViewById(R.id.flashcard_question)).setText(string1);
            ((TextView) findViewById(R.id.flashcard_answer)).setText(string2);
            ((TextView) findViewById(R.id.answer_choice_1)).setText(string2);
            ((TextView) findViewById(R.id.answer_choice_2)).setText(string3);
            ((TextView) findViewById(R.id.answer_choice_3)).setText(string4);
            ((TextView) findViewById(R.id.answer_choice_4)).setText(string5);

        }

    }

}
