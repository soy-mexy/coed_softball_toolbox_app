package com.gdragon.coedsoftballtoolbox

import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.core.app.ComponentActivity.ExtraData
import androidx.core.content.ContextCompat.getSystemService
import android.icu.lang.UCharacter.GraphemeClusterBreak.T
import android.view.View
import kotlinx.android.synthetic.main.activity_display_message.*
import org.w3c.dom.Text
import java.lang.StringBuilder


class InsertNamesActivity : AppCompatActivity() {
    val maleList = ArrayList<String>()
    val femaleList = ArrayList<String>()
    val maleDisplayList = StringBuilder()
    val femaleDisplayList = StringBuilder()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_display_message)
        val coedLiteFlag = intent.getBooleanExtra("coedLiteFlag", true)
        // Get the Intent that started this activity and extract the string
        val message = coedLiteFlag.toString();

    }

    fun addMale(view: View){
        // Capture the layouts's TextView and set the string as its text
        val maleName = male_insert_text.text.toString()

        maleList.add(maleName)
        maleDisplayList.append(maleName + "\n")

        male_insert_text.text.clear()

        findViewById<TextView>(R.id.male_list_textview).apply{
            text = maleDisplayList.toString()
        }
    }

    fun addFemale(view: View){
        // Capture the layouts's TextView and set the string as its text
        val femaleName = female_insert_text.text.toString()

        femaleList.add(femaleName)
        femaleDisplayList.append(femaleName + "\n")

        female_insert_text.text.clear()

        findViewById<TextView>(R.id.female_list_textview).apply{
            text = femaleDisplayList.toString()
        }

    }

    fun doneAndCreateList





}
