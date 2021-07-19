package com.example.m07chapt8menuswebviews

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
//Make sure that you added the plugin to the gradle file,
// synced the gradle and added the import statement

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //You will add code here to set up the id of the notification channel
        //You will also add the code to navigate to the web.
        //Note: IMPORTANT, book uses "http://"  You must change this to "https://
        //          WITHOUT THIS CHANGE YOUR CODE WON'T WORK

    }
}