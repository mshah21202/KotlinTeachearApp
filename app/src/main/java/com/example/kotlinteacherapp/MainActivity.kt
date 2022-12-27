package com.example.kotlinteacherapp

import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.AdapterView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val mListView = findViewById<ListView>(R.id.list)
        val arrayAdapter: LessonAdapter

        val lessons: Array<Lesson> = arrayOf(
            Lesson("Lesson 1", "this is a description for lesson 1", 3),
            Lesson("Lesson 2", "this is a description for lesson 2", 5),
            Lesson("Lesson 2", "this is a description for lesson 2", 8),
        )
        arrayAdapter = LessonAdapter(
            this,
            R.layout.card_view, R.id.titleTV, lessons
        )
        mListView.adapter = arrayAdapter

    }

    override fun onCreateOptionsMenu(menu: Menu): Boolean {
        val inflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        //TODO: quiz activity intent

        return true
    }
}





