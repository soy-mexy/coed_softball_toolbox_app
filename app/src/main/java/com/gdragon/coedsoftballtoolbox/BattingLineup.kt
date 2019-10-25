package com.gdragon.coedsoftballtoolbox

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_batting_lineup.*

class BattingLineup : AppCompatActivity() {
    var coedLiteFlag = false
    var maleList = ArrayList<String>()
    var femaleList = ArrayList<String>()
    var femaleIndex = 0
    var maleIndex = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_batting_lineup)
        coedLiteFlag = intent.getBooleanExtra("coedLiteFlag", true)
        maleList = intent.getStringArrayListExtra("maleList")
        femaleList = intent.getStringArrayListExtra("femaleList")

        batting_lineup.text = createDisplayList(coedLiteFlag, maleList, femaleList)

    }

    fun createDisplayList(coedLite: Boolean, mList: ArrayList<String>, fList: ArrayList<String>): String{
        val battingLineupDisplay = StringBuilder()


        if(coedLite){
            val maleArray = mList.toArray()
            while(maleIndex < maleArray.size) {
                battingLineupDisplay.append(maleArray[maleIndex]).append("\n")
                if(++maleIndex < maleArray.size) {
                    battingLineupDisplay.append(maleArray[maleIndex]).append("\n")
                }
                else{
                    break
                }
                if(femaleIndex == fList.size){
                    femaleIndex = 0
                }
                battingLineupDisplay.append(femaleList[femaleIndex] + "\n")
                femaleIndex++
                maleIndex++
            }
        }
        else{
            val maleArray = mList.toArray()
            for(maleIndex in maleArray.indices) {
                battingLineupDisplay.append(maleArray[maleIndex]).append("\n")
                if(femaleIndex == fList.size){
                    femaleIndex = 0
                }
                battingLineupDisplay.append(femaleList[femaleIndex] + "\n")
                femaleIndex++
            }
        }

        return battingLineupDisplay.toString()
    }
}
