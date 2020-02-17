package com.example.tween

import android.os.Bundle
import android.view.View
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Show : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.show)

        val boton_show = findViewById(R.id.button_show) as Button
        val text_animated = findViewById(R.id.text_show) as TextView
        text_animated.visibility = View.INVISIBLE

        boton_show.setOnClickListener(object : View.OnClickListener {
            override fun onClick(v: View?) {

                var ianim = if (text_animated.visibility==View.VISIBLE) R.anim.translate_show else R.anim.translate_hide
                text_animated.visibility = if (ianim==R.anim.translate_show)  View.INVISIBLE else View.VISIBLE
                var animation: Animation = AnimationUtils.loadAnimation(this@Show,ianim)
                text_animated.startAnimation(animation)

            }
        })

    }

}