package com.example.kotlinteacherapp

import android.content.Intent
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
            Lesson("Lesson 1", "this is a description for lesson 1", 3, "https://www.youtube.com/watch?v=GP4p3d7_b2k&list=PLpZQVidZ65jPUF-o0LUvkY-XVAAkvL-Xb"),
            Lesson("Lesson 2", "this is a description for lesson 2", 5, "https://www.youtube.com/watch?v=Q4uud_0hppw&list=PLpZQVidZ65jPUF-o0LUvkY-XVAAkvL-Xb&index=2"),
            Lesson("Lesson 2", "this is a description for lesson 2", 8, "https://www.youtube.com/watch?v=U3xMvBYM55g&list=PLpZQVidZ65jPUF-o0LUvkY-XVAAkvL-Xb&index=3"),
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
        when (item.itemId){
            R.id.item1 -> {
                val intent = Intent(this, QuizActivity::class.java )
                startActivity(intent)
            }
        }
        return true
    }
}





