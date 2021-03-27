package com.example.happybirthday

import android.content.Intent
import android.graphics.drawable.AnimationDrawable
import android.graphics.drawable.Drawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.Animation
import androidx.annotation.RequiresApi
import androidx.core.view.isVisible
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    @RequiresApi(Build.VERSION_CODES.LOLLIPOP)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var ad = AnimationDrawable()

        var imagen1 = resources.getDrawable(R.drawable.uno, null)
        var imagen2 = resources.getDrawable(R.drawable.dos, null)
        var imagen3 = resources.getDrawable(R.drawable.tres, null)
        var imagen4 = resources.getDrawable(R.drawable.cuatro, null)
        var estado = 0

        ad.addFrame(imagen1, 200)
        ad.addFrame(imagen2, 200)
        ad.addFrame(imagen3, 200)
        ad.addFrame(imagen4, 200)

        Cake.background = ad
        On.setOnClickListener {
            ad.start()
            apagado.isVisible = false

            Off.setOnClickListener {
                ad.stop()
                apagado.isVisible = true
            }
        }
    }
}




