package com.example.practisactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.example.practisactivity.databinding.ActivityMainBinding

class MainActivity : BaseActivity() {

    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        binding= ActivityMainBinding.inflate(layoutInflater)
        super.onCreate(savedInstanceState)
        setContentView(binding.root)



     binding.btn4.setOnClickListener{

         intent = Intent(this,webview::class.java)
         startActivity(intent)
     }

        binding.btn1.setOnClickListener{
            Alert()
        }

        binding.btn2.setOnClickListener{

            val progressdialog=progress()
        }
    }


}