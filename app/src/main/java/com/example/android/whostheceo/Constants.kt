package com.example.android.whostheceo

object Constants {


    fun getQuestion(): ArrayList<Question> {

        val questionList = ArrayList<Question>()

        //QUE 1
        val que1 = Question(
            1,
            "CEO of Amazon",
            R.drawable.bg,
            "Bill Gates",
            "Satya Nadella",
            "Jimmy Rock",
            "Buzaak",
            4
        )
        questionList.add(que1)

        //QUE 2
        val que2 = Question(
            2,
            "CEO of Zomato",
            R.drawable.bg,
            "Gopinder",
            "Jeff Bezos",
            "Sundar Pichai",
            "Mark Zukerberg",
            4
        )
        questionList.add(que2)

        //QUE 3
        val que3 = Question(
            3,
            "CEO of Paypal",
            R.drawable.bg,
            "Bill Gates",
            "Satya Nadella",
            "Picasso",
            "Jeff Bezos",
            2
        )
        questionList.add(que3)

        //QUE 4
        val que4 = Question(
            4,
            "CEO of Microsoft",
            R.drawable.bg,
            "Bill Gates",
            "Satya Nadella",
            "Picasso",
            "Jeff Bezos",
            2
        )
        questionList.add(que4)

        //QUE 5
        val que5 = Question(
            5,
            "CEO of Google",
            R.drawable.bg,
            "Bill Gates",
            "Satya Nadella",
            "Sundar Pichai",
            "Jeff Bezos",
            3
        )
        questionList.add(que1)
        return questionList
    }

}