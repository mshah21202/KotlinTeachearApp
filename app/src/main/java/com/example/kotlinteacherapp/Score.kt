package com.example.kotlinteacherapp

import android.os.Bundle
import android.view.View
import android.widget.TextView
import androidx.fragment.app.DialogFragment

class Score:DialogFragment(R.layout.score) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?){
        val tv : TextView = view.findViewById(R.id.scoreTV)
        tv.text = QuizProvider.SCORE.toString()
    }
}