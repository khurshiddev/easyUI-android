package com.example.a19_recycler_view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.a19_recycler_view.databinding.ActivityImageViewBinding

class ImageViewActivity : AppCompatActivity() {
    private lateinit var  binding :ActivityImageViewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityImageViewBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val imageId = intent.getIntExtra("image",R.drawable.cheery)
        binding.imageView.setImageResource(imageId)
    }
}