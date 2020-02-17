package com.example.tween

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btn_push = findViewById(R.id.Button) as com.google.android.material.button.MaterialButton
        btn_push.setOnClickListener{
            lanzarPush()
        }
        val btn_show = findViewById(R.id.Button1) as com.google.android.material.button.MaterialButton
        btn_show.setOnClickListener{
            lanzarShow()
        }
        val btn_animate = findViewById(R.id.Button2) as com.google.android.material.button.MaterialButton
        btn_animate.setOnClickListener{
            lanzarAnimate()
        }
        val btn_progress = findViewById(R.id.Button3) as com.google.android.material.button.MaterialButton
        btn_progress.setOnClickListener{
            lanzarProgress()
        }

        val btn_rotate = findViewById(R.id.Button5) as com.google.android.material.button.MaterialButton
        btn_rotate.setOnClickListener{
            lanzarRotate()
        }

        val btn_boton = findViewById(R.id.Button6) as com.google.android.material.button.MaterialButton
        btn_boton.setOnClickListener{
            lanzarBotonPulsado()
        }

        val btn_salir = findViewById(R.id.Button4) as com.google.android.material.button.MaterialButton
        btn_salir.setOnClickListener{
            finish()
        }
    }

    fun lanzarPush(){
        startActivity(Intent(this, Push::class.java))
    }
    fun lanzarShow(){
        startActivity(Intent(this, Show::class.java))
    }
    fun lanzarAnimate(){
        startActivity(Intent(this, Animate::class.java))
    }
    fun lanzarProgress(){
        startActivity(Intent(this, Progress::class.java))
    }
    fun lanzarRotate(){
        startActivity(Intent(this, RotateText::class.java))
    }

    fun lanzarBotonPulsado(){
        startActivity(Intent(this, BotonPulsado::class.java))
    }

}




