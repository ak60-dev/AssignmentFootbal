package com.example.assignmentfootball

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class FootBall : AppCompatActivity() {

    // Variables to store scores
    private var team1Score = 0
    private var team2Score = 0

    // Views
    private lateinit var team1ScoreText: TextView
    private lateinit var team2ScoreText: TextView
    private lateinit var team1AddButton: Button
    private lateinit var team2AddButton: Button
    private lateinit var resetButton: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // Ensure the correct layout is set

        // Initialize views
        team1ScoreText = findViewById(R.id.team1_score)
        team2ScoreText = findViewById(R.id.team2_score)
        team1AddButton = findViewById(R.id.team1_add_button)
        team2AddButton = findViewById(R.id.team2_add_button)
        resetButton = findViewById(R.id.reset_button)

        // Set up button click listeners
        team1AddButton.setOnClickListener {
            team1Score++
            updateScores()
        }

        team2AddButton.setOnClickListener {
            team2Score++
            updateScores()
        }

        resetButton.setOnClickListener {
            team1Score = 0
            team2Score = 0
            updateScores()
        }
    }

    // Function to update the scores in TextViews
    private fun updateScores() {
        team1ScoreText.text = team1Score.toString()
        team2ScoreText.text = team2Score.toString()
    }
}
