package com.example.tween

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils.loadAnimation
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.animation.AnimationUtils

class Push : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.push)




        val text_animated = findViewById(R.id.text_animated) as TextView


        text_animated.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val animation: Animation = loadAnimation(this@Push, R.anim.rotate)
                text_animated.startAnimation(animation)
            }
        })



    }

}