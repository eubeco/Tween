package com.example.tween

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Animate : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.animate)


        val image_animated = findViewById(R.id.imagen_android) as ImageView
        val boton_animate = findViewById(R.id.button_animate) as Button

        boton_animate.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {
                val animation: Animation = AnimationUtils.loadAnimation(this@Animate, R.anim.animate)
                image_animated.startAnimation(animation)
            }
        })
    }

}