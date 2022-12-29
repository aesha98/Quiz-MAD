package com.example.quiz_mad;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // TODO: Declare member variables here:


    // TODO: Uncomment to create question bank
//    private Quiz[] mQuestionBank = new Quiz[] {
//            new Quiz(R.string.question_1, true),
//            new Quiz(R.string.question_2, false),
//            new Quiz(R.string.question_3, true),
//            new Quiz(R.string.question_4, true),
//            new Quiz(R.string.question_5, true),
//            new Quiz(R.string.question_6, false),
//            new Quiz(R.string.question_7, true),
//            new Quiz(R.string.question_8, false),
//            new Quiz(R.string.question_9, true),
//            new Quiz(R.string.question_10, false),
//            new Quiz(R.string.question_11, true),
//            new Quiz(R.string.question_12, false),
//            new Quiz(R.string.question_13,false)
//    };

    // TODO: Declare constants here


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}