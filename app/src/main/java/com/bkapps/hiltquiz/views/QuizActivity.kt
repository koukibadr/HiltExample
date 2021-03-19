package com.bkapps.hiltquiz.views

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModel
import androidx.recyclerview.widget.RecyclerView
import com.bkapps.hiltquiz.R
import com.bkapps.hiltquiz.databinding.ActivityMainBinding
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class QuizActivity : AppCompatActivity() {

    private val questionViewModel by viewModels<QuizVM>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.listOfQuestions)

        questionViewModel.getQuestions().observe(this, Observer {
            recyclerView.adapter = QuestionsAdapter(it.questions ?: emptyList())
        })
    }
}