package com.example.android.whostheceo

import android.graphics.Color
import android.graphics.Typeface
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.TextView
import androidx.core.content.ContextCompat
import kotlinx.android.synthetic.main.activity_quiz_question.*
import kotlinx.android.synthetic.main.activity_quiz_question.view.*

class QuizQuestionActivity : AppCompatActivity(), View.OnClickListener {


    private var mCurrentPosition: Int = 1
    private var mQuestionList: ArrayList<Question>? = null
            private var mSelectedOptionPosition: Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_quiz_question)

        mQuestionList = Constants.getQuestion()
        setQuestions()

        option1_tv.setOnClickListener(this)
        option2_tv.setOnClickListener(this)
        option3_tv.setOnClickListener(this)
        option4_tv.setOnClickListener(this)

    }

    private fun setQuestions() {

        val mCurrentPosition = 1
        val question = mQuestionList!![mCurrentPosition - 1]

        defaultOptionsView()

        progress_bar.progress = mCurrentPosition
        progress_tv.text = "$mCurrentPosition" +"/" + progress_bar.max

        question_text_view.text = question!!.question

        image.setImageResource(R.drawable.airbnb)

        option1_tv.text = question!!.optionOne
        option2_tv.text = question!!.optionTwo
        option3_tv.text = question!!.optionThree
        option4_tv.text = question!!.optionFour


    }

    private fun defaultOptionsView() {
        var options = ArrayList<TextView>()
        options.add(0, option1_tv)
        options.add(0, option2_tv)
        options.add(0, option3_tv)
        options.add(0, option4_tv)

        for(option in options){
            option.setTextColor(Color.parseColor("#7A8089"))
            option.typeface = Typeface.DEFAULT
            option.background = ContextCompat.getDrawable(this,
                R.drawable.default_border__bg)

        }

    }

    override fun onClick(v: View?) {

        when(v?.id){
            R.id.option1_tv -> selectedOptionView(option1_tv, 1)
            R.id.option2_tv -> selectedOptionView(option2_tv, 2)
            R.id.option3_tv -> selectedOptionView(option3_tv, 3)
            R.id.option4_tv -> selectedOptionView(option4_tv, 4)

        }

    }

    private fun selectedOptionView(tv: TextView, selectedOptionNumber: Int){
        defaultOptionsView()
        mSelectedOptionPosition = selectedOptionNumber

        tv.setTextColor(Color.parseColor("#363A43"))
        tv.setTypeface(tv.typeface, Typeface.BOLD)

        tv.background = ContextCompat.getDrawable(this,
        R.drawable.selected_default_border__bg)

    }
}