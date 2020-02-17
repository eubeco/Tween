package com.example.tween

import android.animation.ObjectAnimator
import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils.loadAnimation
import android.view.animation.LinearInterpolator
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.animation.AnimationUtils

class RotateText : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.rotatetext)




        val text_rotated = findViewById(R.id.text_rotated) as TextView


        text_rotated.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val anim = ObjectAnimator.ofFloat(text_rotated, "rotationY", 0f, 360f)
                anim.duration = 2000
                anim.interpolator = LinearInterpolator()
                anim.start()



            }
        })



    }

}