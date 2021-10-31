package com.example.companionobjectsapp

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    lateinit var tvMain : TextView
    lateinit var edtChange : EditText
    lateinit var changBtn : Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        tvMain=findViewById(R.id.tvMain)
        edtChange=findViewById(R.id.edChange)
        changBtn=findViewById(R.id.btnChange)


        changBtn.setOnClickListener{
            val time = edtChange.text.toString().lowercase()

            when(time){
                "day" ->{
                    Time.changeBckg(findViewById(R.id.clMain),Time.day)
                    tvMain.setTextColor(Color.YELLOW)
                    edtChange.setTextColor(Color.YELLOW)
                    changBtn.setTextColor(Color.YELLOW)
                        }
                "night" ->{
                    Time.changeBckg(findViewById(R.id.clMain),Time.night)
                    tvMain.setTextColor(Color.WHITE)
                    edtChange.setTextColor(Color.WHITE)
                    changBtn.setTextColor(Color.WHITE)
                          }
                        }

                }
    }
}