package com.example.zadanie_mobilne_seekbar_do_zdjec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //picture declaration
        val picture1 = findViewById<ImageView>(R.id.imgPies1)
        val picture2 = findViewById<ImageView>(R.id.imgPies2)
        val picture3 = findViewById<ImageView>(R.id.imgPies3)

        //seekbary vertical
        val seekbVerticalp1 = findViewById<SeekBar>(R.id.seekBHeightp1)
        val seekbVerticalp2 = findViewById<SeekBar>(R.id.seekBHeightp2)
        val seekbVerticalp3 = findViewById<SeekBar>(R.id.seekBHeightp3)

        // seekbar horizontal
        val seekbHorizontalp1 = findViewById<SeekBar>(R.id.seekBWidthp1)
        val seekbHorizontalp2 = findViewById<SeekBar>(R.id.seekBWidthp2)
        val seekbHorizontalp3 = findViewById<SeekBar>(R.id.seekBWidthp3)

        //progressBar horizontal and vertical
        val  progressViewHorizontal = findViewById<ProgressBar>(R.id.progressBarWidth)
        val  progressViewVertical = findViewById<ProgressBar>(R.id.progressBarHeight)

        //reset button
        val reset = findViewById<Button>(R.id.Reset)
    }
}