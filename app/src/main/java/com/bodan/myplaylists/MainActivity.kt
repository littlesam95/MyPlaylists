package com.bodan.myplaylists

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bodan.myplaylists.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}