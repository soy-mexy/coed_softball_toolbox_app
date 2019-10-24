package com.gdragon.coedsoftballtoolbox

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class BattingLineup : AppCompatActivity() {
    var coedLiteFlag = false
    var maleList = ArrayList<String>()
    var femaleList = ArrayList<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batting_lineup)
        coedLiteFlag = intent.getBooleanExtra("coedLiteFlag", true)
        maleList = (intent.getStringArrayListExtra("maleList"))
        femaleList = (intent.getStringArrayListExtra("femaleList"))

    }

    fun createDisplayList(coedLite: Boolean, mList: ArrayList<String>, fList: ArrayList<String>): String{
        val battingLineupDisplay = StringBuilder()
        val maleIndex = 0;
        val femaleIndex = 0;

        if(coedLite){

        }
        else{
            for(i in 1..12){

            }


        }

        return battingLineupDisplay.toString()
    }
}
