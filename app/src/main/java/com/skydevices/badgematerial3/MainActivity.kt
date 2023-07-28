package com.skydevices.badgematerial3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import com.skydevices.badgematerial3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private val binding by  lazy {
        ActivityMainBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val badge = binding.bottomNavigationView.getOrCreateBadge(R.id.page_1)
        badge.isVisible = true
        badge.number = 90

        val badge2 = binding.bottomNavigationView.getOrCreateBadge(R.id.page_2)
        badge2.isVisible = true
        badge2.number = 3

        binding.bottomNavigationView.setOnItemSelectedListener {
            when(it.itemId){
                R.id.page_1 ->{
                    true
                }
                R.id.page_2 ->{
                    true
                }
                R.id.page_3 ->{
                    true
                }else->{
                    false
                }
            }
        }
    }
}