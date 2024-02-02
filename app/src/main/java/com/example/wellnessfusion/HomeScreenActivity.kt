package com.example.wellnessfusion

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ToggleButton
import androidx.appcompat.app.AppCompatActivity
import com.example.wellnessfusion.overlays.PhysicalOverlayFragment
import com.example.wellnessfusion.overlays.ZenOverlayFragment

class HomeScreenActivity : AppCompatActivity() {
    private lateinit var toggleButtonHappy: ToggleButton

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Initialize toggle buttons
        toggleButtonHappy = findViewById(R.id.toggleHappy)

        // Initialize your buttons and other components here
        val physicalButton: Button = findViewById(R.id.physicalButton)
        val zenButton: Button = findViewById(R.id.zenButton)
        val submitButton: Button = findViewById(R.id.submitButton)
        val profileActivity: Button = findViewById(R.id.profileButton)
        val favoritesActivity: Button = findViewById(R.id.favoritesButton)
        val outputScreenActivity: Button = findViewById(R.id.submitButton)

        // Set up listeners for your toggle buttons
        physicalButton.setOnClickListener {
            // Open workout category selection
            PhysicalOverlayFragment().show(supportFragmentManager, "physical_overlay")
        }

        zenButton.setOnClickListener {
            // Open workout category selection
            ZenOverlayFragment().show(supportFragmentManager, "zen_overlay")
        }

        submitButton.setOnClickListener {
            // Collect all selected data and navigate to Workout Build Screen
        }

        toggleButtonHappy.setOnCheckedChangeListener { _, isChecked ->
            if (isChecked) {
//                toggleButtonSad.isChecked = false
                // Additional logic when 'Happy' is selected
            }
        }
        profileActivity.setOnClickListener {
            val intent = Intent(this, ProfileActivity::class.java)
            startActivity(intent)
        }
        favoritesActivity.setOnClickListener {
            val intent = Intent(this, WorkoutsActivity::class.java)
            startActivity(intent)
        }
        outputScreenActivity.setOnClickListener {
            val intent = Intent(this, OutputScreen::class.java)
            startActivity(intent)
        }

    }
}


