package com.gdragon.coedsoftballtoolbox

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    /** Called when the user taps the Send Button */
    fun coedLiteBegin(view: View) {

        val intent = Intent(this, InsertNamesActivity::class.java).apply {
            putExtra("coedLiteFlag", true)
        }

        startActivity(intent)
    }

    fun coedBegin(view: View){
        val intent = Intent(this, InsertNamesActivity::class.java).apply {
            putExtra("coedLiteFlag", false)
        }

        startActivity(intent)
    }
}
