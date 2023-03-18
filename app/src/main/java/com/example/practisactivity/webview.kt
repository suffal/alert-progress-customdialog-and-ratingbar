package com.example.practisactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.practisactivity.databinding.ActivityWebviewBinding

class webview : AppCompatActivity() {
    private lateinit var binding: ActivityWebviewBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityWebviewBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        supportActionBar?.hide()




        binding.webview.loadUrl("https://developer.android.com/kotlin")



    }
}