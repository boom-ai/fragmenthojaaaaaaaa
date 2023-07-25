package com.example.fragmenthojaaaaaaaa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.fragmenthojaaaaaaaa.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var a=10
    lateinit var binding: ActivityMainBinding
    var ClickInterface:ClickInterface?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.btnAdd.setOnClickListener {
            a++
            ClickInterface?.ActivityClickAdd(a)
        }
        binding.btnSub.setOnClickListener {
            a--
            ClickInterface?.ActivityClickSub(a)
        }

    }



    fun ChangeText(text: String){
        binding.tvActivityText.setText(text)
    }
}