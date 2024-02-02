package com.example.wellnessfusion

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.wellnessfusion.data_class.Adapters.exercise_plan_adapter
import com.example.wellnessfusion.models.Exercise

class OutputScreen : AppCompatActivity() {
    private lateinit var exercisePlanRecyclerView: RecyclerView
    private lateinit var exercisePlanAdapter: exercise_plan_adapter
    @SuppressLint("MissingInflatedId", "CutPasteId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_output_screen)

        val exercises = listOf(
            Exercise("Bench Press", "100", 3, "10"),
            Exercise("Squats", "200", 3, "10"),
            Exercise("Deadlifts", "300", 3, "10"),
            Exercise("Pull Ups", "400", 3, "10"),
            Exercise("Push Ups", "500", 3, "10"),
            Exercise("Sit Ups", "600", 3, "10"),
            Exercise("Lunges", "700", 3, "10"),
            Exercise("Curls", "800", 3, "10"),
            Exercise("Shoulder Press", "900", 3, "10"),
            Exercise("Tricep Extensions", "1000", 3, "10")
        )

        exercisePlanRecyclerView = findViewById(R.id.exercisesRecyclerView)
        exercisePlanRecyclerView.layoutManager = LinearLayoutManager(this)
        exercisePlanAdapter = exercise_plan_adapter(exercises, supportFragmentManager)
        exercisePlanRecyclerView.adapter = exercisePlanAdapter



    }




}