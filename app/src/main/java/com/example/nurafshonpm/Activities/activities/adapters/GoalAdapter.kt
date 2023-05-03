package com.example.nurafshonpm.Activities.activities.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.nurafshonpm.Activities.activities.model.Goals
import com.example.nurafshonpm.Activities.activities.model.ModelRating
import com.example.nurafshonpm.R

class GoalAdapter(val goalLists:ArrayList<Goals>):RecyclerView.Adapter<RecyclerView.ViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.goal_layout, parent, false)
        return GoalsViewHolder(view)
    }

    override fun getItemCount(): Int {
        return goalLists.size
    }

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        val model: Goals = goalLists[position]
        if(holder is GoalAdapter.GoalsViewHolder){
            holder.goal.text = model.goal
        }
    }

    inner class GoalsViewHolder(view: View):RecyclerView.ViewHolder(view){
        var goal: TextView = view.findViewById(R.id.goalText_id)
    }
}