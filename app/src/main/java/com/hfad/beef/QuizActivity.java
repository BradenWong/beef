package com.hfad.beef;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.google.gson.Gson;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Arrays;
import java.util.List;

public class QuizActivity extends AppCompatActivity implements View.OnClickListener {
    public static final String TAG = "mainActivity";
    public int score;
    private Quiz quiz;
    private boolean userAnswer;
    private TextView questionDisplayed;
    private TextView scoreDisplayed;
    private Button falsee;
    private Button truee;
    private question[] questions;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quiz);
        wireWidgets();
        setOnClickListeners();
        score = 0;
        InputStream XmlFileInputStream = getResources().openRawResource(R.raw.questons);

        String jsonstring = readTextFile(XmlFileInputStream);
        Log.d(TAG, "onCreate: " + jsonstring);

        Gson gson = new Gson();
        questions = gson.fromJson(jsonstring, question[].class);

        List<question> questionsList = Arrays.asList(questions);
        quiz = new Quiz(questionsList);
        displayScore();
        displayQuestion();

    }

    private void displayScore() {
        if(quiz.isThereAnotherQuestion()) {
            scoreDisplayed.setText("SCORE :" + score);
        }else{
            scoreDisplayed.setText("SCORE :" + score);
        }
    }

    private void sendMessage() {
        if ((userAnswer)) {
            Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "WRONG", Toast.LENGTH_SHORT).show();
        }
    }

    private void displayQuestion() {
        if(quiz.isThereAnotherQuestion()){
            question aquestion = questions[quiz.getCurrentQuestion()];
            questionDisplayed.setText(aquestion.getQuestion());
        }else{
            questionDisplayed.setText("NO MORE QUESTINS");
        }
    }


    private void setOnClickListeners() {
        falsee.setOnClickListener(this);
        truee.setOnClickListener(this);
    }


    private void wireWidgets() {
        questionDisplayed = findViewById(R.id.textView_main_question);
        falsee = findViewById(R.id.button_main_false);
        truee = findViewById(R.id.button_main_true);
        scoreDisplayed = findViewById(R.id.textView_main_score);
    }

    public String readTextFile(InputStream inputStream) {
        ByteArrayOutputStream outputStream = new ByteArrayOutputStream();

        byte buf[] = new byte[1024];
        int len;
        try {
            while ((len = inputStream.read(buf)) != -1) {
                outputStream.write(buf, 0, len);
            }
            outputStream.close();
            inputStream.close();
        } catch (IOException e) {

        }
        return outputStream.toString();
    }

    public void onClick(View view) {
        //one method to handel the clicks of all the buttons
        //but don't forget to tell the buttons who is doing the listening
        switch (view.getId()) {
            case R.id.button_main_false:
                userAnswer = false;
                question aquestion = questions[quiz.getCurrentQuestion()];
                if ((userAnswer) == aquestion.isAnswer() ) {
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    score++;
                } else {
                    Toast.makeText(this, "WRONG", Toast.LENGTH_SHORT).show();
                }
                quiz.isThereAnotherQuestion();
                quiz.nextQuestion();
                displayQuestion();
                displayScore();
                break;
            case R.id.button_main_true:
                userAnswer = true;
                question bquestion = questions[quiz.getCurrentQuestion()];

                if ((userAnswer) == bquestion.isAnswer() ) {
                    Toast.makeText(this, "Correct", Toast.LENGTH_SHORT).show();
                    score++;
                } else {
                    Toast.makeText(this, "WRONG", Toast.LENGTH_SHORT).show();
                }
                quiz.isThereAnotherQuestion();
                quiz.nextQuestion();
                displayQuestion();
                displayScore();
                break;
        }
    }

}

