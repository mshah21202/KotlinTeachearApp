package com.example.kotlinteacherapp
import android.widget.ArrayAdapter
import android.widget.ListView
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.core.view.get
import android.view.MenuInflater as MenuInflater1

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var mListView = findViewById<ListView>(R.id.list)
        val arrayAdapter: ArrayAdapter<*>
        val lessonTitle = arrayOf(
            "lesson 1","lesson 2","lesson 3"
        )
        val lessonDesc = arrayOf(
            "this is a description for lesson 1","this is a description for lesson 2","this is a description for lesson 3"
        )
        //TODO: rest of the list
        arrayAdapter = ArrayAdapter(this,
            R.layout.card_view,R.id.titleTV , lessonTitle)

        mListView.adapter = arrayAdapter
        mListView.onItemClickListener
    }
    override fun onCreateOptionsMenu(menu: Menu): Boolean {
     val inflater = menuInflater
     inflater.inflate(R.menu.menu, menu)
     return super.onCreateOptionsMenu(menu)
     }
    override fun onOptionsItemSelected(item: MenuItem): Boolean{
        //TODO: quiz activity intent

        return true
    }
}

