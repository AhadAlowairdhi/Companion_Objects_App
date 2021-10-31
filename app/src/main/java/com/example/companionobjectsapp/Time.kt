package com.example.companionobjectsapp

import android.view.View

class Time {

    companion object{
        const val day = true
        const val night = false

        fun changeBckg(layout: View, time: Boolean ){
            when(time){
               true -> layout.setBackgroundResource(R.drawable.day)
                false -> layout.setBackgroundResource(R.drawable.night)
            }
        }

    }
}