package com.example.minipaint

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val myCanvas = MyCanvasView(this)
        myCanvas.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        myCanvas.contentDescription = getString(R.string.canvasContentDescription)
        setContentView(myCanvas)
    }
}