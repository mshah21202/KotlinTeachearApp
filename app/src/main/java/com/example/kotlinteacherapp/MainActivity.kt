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
            Lesson("WHY LEARN KOTLIN?", "We will learn where Kotlin can be used and what advantages it has to over other programming languages like Java.", 6, "https://www.youtube.com/watch?v=k9K71QkrHGE&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2"),
            Lesson("INSTALL INTELLIJ IDEA ON WINDOWS", "We will install IntelliJ IDEA on Windows. In the process, we will learn about important terms like IDE, JVM, and JDK.", 15, "https://www.youtube.com/watch?v=fwZyfudxnNo&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=2"),
            Lesson("HELLO WORLD!", "We will write, compile and run our first lines of code and in the process learn what the main function is.", 10, "https://www.youtube.com/watch?v=1676actiiME&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=4"),
            Lesson("VARIABLES", "We will learn about mutable (var) and read-only variables (val), String templates, and type inference.", 15, "https://www.youtube.com/watch?v=kYO7YWVB3jY&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=5"),
            Lesson("BASIC DATA TYPES", " We will learn about the 8 primitive data types (Byte, Short, Int, Long, Float, Double, Char, and Boolean), raw strings, and type conversion.", 20, "https://www.youtube.com/watch?v=b_qtmAL9540&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=6"),
            Lesson("ARITHMETIC OPERATORS", "We will learn how to use the different math, compound assignment, and increment/decrement operators.", 15, "https://www.youtube.com/watch?v=zzYKHR7nTe0&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=7"),
            Lesson("READ, EVAL, PRINT, LOOP (REPL)", "We will learn how to use the REPL tool to quickly try out code snippets on the fly.", 5, "https://www.youtube.com/watch?v=lUiePALzrQs&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=8"),
            Lesson("COMMENTS", "We will learn how to add comments to our code to describe it's functionality and make notes.", 4, "https://www.youtube.com/watch?v=4CjchnS02ys&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=9"),
            Lesson("ARRAYS", "We will learn how to use arrays to store multiple values under one variable name and access them by an index.", 15, "https://www.youtube.com/watch?v=lWd6TYhnJAk&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=10"),
            Lesson("FOR-LOOP & RANGES", "We will learn how to use for-loops to iterate through arrays, ranges, and anything else that provides an iterator.", 10, "https://www.youtube.com/watch?v=N0p2XUqmU1k&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=11"),
            Lesson("COMPARISON & LOGICAL OPERATORS", "We will learn how to use the different comparison and logical operators.", 12, "https://www.youtube.com/watch?v=NrmFU1womI0&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=12"),
            Lesson("WHILE, DO-WHILE & LABELS", "We will learn how to use while loops and do-while loops, how to skip loop iterations with the break and continue keywords, and how to use labels to control which loop these jump expressions target.", 15, "https://www.youtube.com/watch?v=U9UzVgLsqDQ&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=13"),
            Lesson("IF/ELSE", " Will learn how to use the if/else expression to change the control flow of our program.", 14, "https://www.youtube.com/watch?v=RfRbDIxXLtg&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=14"),
            Lesson("WHEN", "We will learn how to use the when expression as a more readable replacement for complex if-else-if ladders.", 11, "https://www.youtube.com/watch?v=J4uBhZKzH3U&list=PLrnPJCHvNZuAIbejjZA1kGfLeA8ZpICB2&index=15"),
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





