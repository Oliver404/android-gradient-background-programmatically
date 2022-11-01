package com.oliverbotello.example.gradientprogrammatically

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import kotlin.random.Random

class MainActivity : AppCompatActivity(), View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }

    private fun initView() {
        findViewById<View>(R.id.btn_change_gradient).setOnClickListener(this)
        assignGradient()
    }

    private fun assignGradient() {
        val gradient = GradientDrawable().apply {
            colors = randomColors()
            orientation = GradientDrawable.Orientation.TOP_BOTTOM
            gradientType = GradientDrawable.LINEAR_GRADIENT
            shape = GradientDrawable.RECTANGLE
        }

        findViewById<View>(R.id.content).background = gradient
    }

    private fun randomColors(): IntArray {
        return intArrayOf(
            getRandomColor(),
            getRandomColor()
        )
    }

    private fun getRandomColor(): Int {
        val r = Random.nextInt(0, 256)
        val g = Random.nextInt(0, 256)
        val b = Random.nextInt(0, 256)

        return Color.rgb(r, g, b)
    }

    override fun onClick(v: View?) {
        assignGradient()
    }
}