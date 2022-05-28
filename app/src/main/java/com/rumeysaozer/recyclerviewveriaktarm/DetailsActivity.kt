package com.rumeysaozer.recyclerviewveriaktarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.rumeysaozer.recyclerviewveriaktarm.databinding.ActivityDetailsBinding


class DetailsActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailsBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailsBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val intent = intent
        val selectedCountry = intent.getSerializableExtra("country") as Country
        binding.cName.text = selectedCountry.county
        binding.textView.text = selectedCountry.capital
        binding.imageView.setImageResource(selectedCountry.image)


    }
}