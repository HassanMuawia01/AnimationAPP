package com.example.myanimation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import android.widget.Button
import android.widget.ImageView

class MainActivity : AppCompatActivity() {
   lateinit var imageView:ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        imageView=findViewById(R.id.imageview)

        val blink=findViewById<Button>(R.id.BTNblink)
        val fade=findViewById<Button>(R.id.BTNfade)
        val move=findViewById<Button>(R.id.BTNmove)
        val rotate=findViewById<Button>(R.id.BTNrotate)
        val slide=findViewById<Button>(R.id.BTNslide)
        val zoom=findViewById<Button>(R.id.BTNzoom)
        val zoomout=findViewById<Button>(R.id.BTNstop)

        blink.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this,R.anim.blink_animation)
            imageView.startAnimation(animation)
        }

        fade.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this,R.anim.fade)
            imageView.startAnimation(animation)
        }

        move.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this,R.anim.move)
            imageView.startAnimation(animation)
        }

        rotate.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this,R.anim.rotate)
            imageView.startAnimation(animation)
        }

        slide.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this,R.anim.slide)
            imageView.startAnimation(animation)
        }

        zoom.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this,R.anim.zoom)
            imageView.startAnimation(animation)
        }
        zoomout.setOnClickListener(){
            val animation=AnimationUtils.loadAnimation(this,R.anim.zoom_out)
            imageView.startAnimation(animation)
        }







    }
}