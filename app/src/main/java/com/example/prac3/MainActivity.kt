package com.example.prac3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import com.example.prac3.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    //in java = int i
    //in kotlin = var i:int (type at the back)
    //lateinit means assign something(value) later on

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        var student: Student = Student("Yw", "RSD")

        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        super.onCreate(savedInstanceState)
        //setContentView(R.layout.activity_main)

        binding.btnSetData.setOnClickListener(){


            binding.myStudent = student

            //binding.tvName.text = "Bobo"
            //binding.tvProgramme.text = "RSD"
        }

        binding.btnChangeValue.setOnClickListener(){
            student.programme  = "RIT"
            binding.invalidateAll() //refresh
        }

    }
}