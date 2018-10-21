package com.example.shiva.flashcardsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

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
                (findViewById(R.id.answer_choice_1)).setBackgroundColor(getResources().getColor(R.color.Red));
                (findViewById(R.id.answer_choice_3)).setBackgroundColor(getResources().getColor(R.color.Green));
            }
        });

        findViewById(R.id.answer_choice_2).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.answer_choice_2)).setBackgroundColor(getResources().getColor(R.color.Red));
                (findViewById(R.id.answer_choice_3)).setBackgroundColor(getResources().getColor(R.color.Green));
            }
        });

        findViewById(R.id.answer_choice_3).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.answer_choice_3)).setBackgroundColor(getResources().getColor(R.color.Green));
            }
        });

        findViewById(R.id.answer_choice_4).setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                (findViewById(R.id.answer_choice_4)).setBackgroundColor(getResources().getColor(R.color.Red));
                (findViewById(R.id.answer_choice_3)).setBackgroundColor(getResources().getColor(R.color.Green));
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
                (findViewById(R.id.answer_choice_4)).setVisibility(View.VISIBLE);
                (findViewById(R.id.answer_choice_3)).setVisibility(View.VISIBLE);
                (findViewById(R.id.answer_choice_2)).setVisibility(View.VISIBLE);
                (findViewById(R.id.answer_choice_1)).setVisibility(View.VISIBLE);
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

    }

}
