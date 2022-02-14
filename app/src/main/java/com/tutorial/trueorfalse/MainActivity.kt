package com.tutorial.trueorfalse

import android.app.Activity
import android.content.Intent
import android.content.Intent.ACTION_VIEW
import android.net.Uri
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val likeButton = findViewById<Button>(R.id.main_activity_like_button)
        val subButton = findViewById<Button>(R.id.main_activity_subscribe_button)

        likeButton.setOnClickListener {
            var message = Toast.makeText(applicationContext, "Dziękuję", Toast.LENGTH_SHORT)
            message.show()
        }

        subButton.setOnClickListener{
            var message = Toast.makeText(applicationContext, "Dobra decyzja!", Toast.LENGTH_LONG)
            message.show()

            var address = "https://www.youtube.com/channel/UCZHHfVxOTL40lqR_Kh3fg9A"
            var channel = Intent(ACTION_VIEW, Uri.parse(address))
            startActivity(channel)
        }
    }
}