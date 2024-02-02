package com.example.wellnessfusion.data_class.Adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageButton
import android.widget.TextView
import androidx.fragment.app.FragmentManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wellnessfusion.R
import com.example.wellnessfusion.models.Exercise
import com.example.wellnessfusion.overlays.exs_overlay

class exercise_plan_adapter(
    private val exercises: List<Exercise>,
    private val supportFragmentManager: FragmentManager
) :
    RecyclerView.Adapter<exercise_plan_adapter.ExerciseViewHolder>() {

    class ExerciseViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val exerciseNameTextView: TextView = view.findViewById(R.id.exerciseName)
        val exerciseWeightTextView: TextView = view.findViewById(R.id.exerciseWeight)
        val setsRepsTextView: TextView = view.findViewById(R.id.exerciseSetsReps)
        val playImageButton: ImageButton = view.findViewById(R.id.exercisePlayButton)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ExerciseViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.exercises_recycler, parent, false)
        return ExerciseViewHolder(view)
    }

    override fun onBindViewHolder(holder: ExerciseViewHolder, position: Int) {
        val exercise = exercises[position]
        holder.exerciseNameTextView.text = exercise.name
        holder.exerciseWeightTextView.text = exercise.weight
        holder.setsRepsTextView.text = "Sets: ${exercise.sets} Reps: ${exercise.reps}"
        holder.playImageButton.setOnClickListener {
            val exsOverlay = exs_overlay()
            exsOverlay.show(supportFragmentManager, "exs_overlay")
            // Play the exercise
        }
        // Configure the weightSpinner with weight options
        // Configure the setsRepsTextView with the exercise sets and reps
        // Set up a click listener for playImageButton if necessary
    }

    override fun getItemCount(): Int = exercises.size
}

