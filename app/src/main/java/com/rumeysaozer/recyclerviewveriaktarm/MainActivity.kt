package com.rumeysaozer.recyclerviewveriaktarm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.rumeysaozer.recyclerviewveriaktarm.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var countryList : ArrayList<Country>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
       binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)
        countryList = ArrayList<Country>()
        val tr = Country("Türkiye","Ankara",R.drawable.tr)
        val pe = Country("Peru","Lima", R.drawable.peru)
        val az = Country("Azerbaycan","Bakü",R.drawable.azarbaycan)
        val ka = Country("Karadağ","Podgoritsa",R.drawable.karadag)
        countryList.add(tr)
        countryList.add(pe)
        countryList.add(az)
        countryList.add(ka)
        binding.recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = RVAdapter(countryList)
        binding.recyclerView.adapter = adapter
    }
}