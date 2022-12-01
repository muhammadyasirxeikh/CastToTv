package com.cc.casttotv

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    var mirrorScreen: ImageView?=null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mirrorScreen=findViewById(R.id.screen_mirror)


        mirrorScreen?.setOnClickListener(View.OnClickListener {

//            startActivity(Intent("android.settings.CAST_SETTINGS"))


        })
        val SPLASH_DISPLAY_LENGTH = 1000
        Handler().postDelayed({ /* Create an Intent that will start the Menu-Activity. */

            startActivity(Intent(this,DashbaordActivity::class.java))

        }, SPLASH_DISPLAY_LENGTH.toLong())
    }
}