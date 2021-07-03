package com.example.android.whostheceo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class QuizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)


        val questionList = Constants.getQuestion()
        Log.i("Question Size: ", "${questionList}")

    }
}