package com.example.android.whostheceo

object Constants {

     const val USER_NAME: String = "user_name"
     const val TOTAL_QUESTIONS: String = "total_questions"
     const val CORRECT_ANSWERS: String = "correct_answers"



    fun getQuestion(): ArrayList<Question> {

        val questionList = ArrayList<Question>()

        //QUE 1
        val que1 = Question(
            1,
            "Who is the CEO of Google",
            R.drawable.google,
            "Bill Gates",
            "Satya Nadella",
            "Sundar Pichai",
            "Mark Zukerberg",
            3
        )
        questionList.add(que1)

        //QUE 2
        val que2 = Question(
            2,
            "Who is the CEO of Facebook",
            R.drawable.bg,
            "Kunal Bahl",
            "Mark Zukerberg",
            "Sundar Pichai",
            "Lei Jun",
            2
        )
        questionList.add(que2)

        //QUE 3
        val que3 = Question(
            3,
            "Who is the CEO of Byju's",
            R.drawable.byju,
            "Bill Gates",
            "Byju Raveendran",
            "Deepinder Goyal",
            "Satya Raveendran",
            2
        )
        questionList.add(que3)

        //QUE 4
        val que4 = Question(
            4,
            "Who is the CEO of Uber",
            R.drawable.uber,
            "Mark Twain",
            "Bhavish Aggarwal",
            "Sundar Pichai",
            "Dara Khosrowshahi",
            4
        )
        questionList.add(que4)

        //QUE 5
        val que5 = Question(
            5,
            "Who is the CEO of Ola",
            R.drawable.ola,
            "Bill Gates",
            "Bhavish Aggarwal",
            "Kunal Shah",
            "Mark Zukerberg",
            2
        )
        questionList.add(que5)

        //QUE 6
        val que6 = Question(
            6,
            "Who is the CEO of Tesla",
            R.drawable.tesla,
            "Bill Gates",
            "Mark Zukerberg",
            "Elon Musk",
            "Bill Gates",
            3
        )
        questionList.add(que6)

        //QUE 7
        val que7 = Question(
            7,
            "Who is the CEO of SAP",
            R.drawable.sap,
            "Bill Gates",
            "Dara Khosrowshahi",
            "Sundar Pichai",
            "Christian Klein",
            4
        )
        questionList.add(que7)

        //QUE 8
        val que8 = Question(
            8,
            "Who is the CEO of Snapdeal",
            R.drawable.snapdeal,
            "Vidit Aatrey",
            "Azhar Iqubal",
            "Mukesh Bansal",
            "Kunal Bahl",
            4
        )
        questionList.add(que8)

        //QUE 9
        val que9 = Question(
            9,
            "Who is the CEO of Flipkart",
            R.drawable.flipkart,
            "Sachin Bansal",
            "Bhavish Aggarwal",
            "Sundar Pichai",
            "Kunal Bahl",
            1
        )
        questionList.add(que9)

        //QUE 10
        val que10 = Question(
            10,
            "Who is the CEO of CRED",
            R.drawable.cred,
            "Kunal Shah",
            "Bhavish Aggarwal",
            "Kunal Bahl",
            "Amit Pandey"
            1
        )
        questionList.add(que10)

        return questionList
    }

}