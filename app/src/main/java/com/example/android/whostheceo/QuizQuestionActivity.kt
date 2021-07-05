package com.example.android.whostheceo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_quiz_question.*
import kotlinx.android.synthetic.main.activity_quiz_question.view.*

class QuizQuestionActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)


        val questionList = Constants.getQuestion()
        Log.i("Question Size: ", "${questionList}")

        val currentPosition = 1
        val question: Question? = questionList[currentPosition - 1]

        progress_bar.progress = currentPosition
        progress_tv.text = "$currentPosition" +"/" + progress_bar.max

        question_text_view.text = question!!.question

        image.setImageResource(question.image)

        option1_tv.text = question!!.optionOne
        option2_tv.text = question!!.optionTwo
        option3_tv.text = question!!.optionThree
        option4_tv.text = question!!.optionFour

    }
}