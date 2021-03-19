package com.bkapps.hiltquiz.views

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bkapps.hiltquiz.R
import com.bkapps.hiltquiz.data.Question

class QuestionsAdapter(private val listOfQuestions: List<Question>): RecyclerView.Adapter<QuestionsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        val listItem = layoutInflater.inflate(R.layout.question_item, parent, false)
        return ViewHolder(listItem)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val question = listOfQuestions[position]
        holder.question.text = question.question
        holder.category.text = question.category
    }

    override fun getItemCount(): Int {
        return listOfQuestions.size
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val question: TextView = itemView.findViewById(R.id.questionBody)
        val category: TextView = itemView.findViewById(R.id.questionCategory)
    }



}