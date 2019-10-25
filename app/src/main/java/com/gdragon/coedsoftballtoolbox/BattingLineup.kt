package com.gdragon.coedsoftballtoolbox

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_batting_lineup.*

class BattingLineup : AppCompatActivity() {
    var coedLiteFlag = false
    var maleList = mutableListOf<String>()
    var femaleList = mutableListOf<String>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batting_lineup)
        coedLiteFlag = intent.getBooleanExtra("coedLiteFlag", true)
        maleList = intent.getStringArrayListExtra("maleList").toMutableList()
        femaleList = intent.getStringArrayListExtra("femaleList").toMutableList()

        batting_lineup.text = createDisplayList()

    }

    fun createDisplayList(): String{
        val battingLineupDisplay = StringBuilder()


        if(coedLiteFlag){
            val mSize = maleList.size
            for(i in 0 until mSize) {
                battingLineupDisplay.append(maleList.get(0)).append("\n")
                battingLineupDisplay.append(maleList.get(1)).append("\n")

                maleList = (maleList.drop(2) + maleList.take(2)).toMutableList()

                battingLineupDisplay.append(femaleList.first() + "\n")
                femaleList = (femaleList.drop(1) + femaleList.take(1)).toMutableList()
            }
        }
        else{
            val mSize = maleList.size
            for(i in 0 until mSize) {

                battingLineupDisplay.append(maleList.first()).append("\n")
                maleList = (maleList.drop(1) + maleList.take(1)).toMutableList()

                battingLineupDisplay.append(femaleList.first() + "\n")
                femaleList = (femaleList.drop(1) + femaleList.take(1)).toMutableList()
            }
        }

        return battingLineupDisplay.toString()
    }
}
