package com.example.zadanie_mobilne_seekbar_do_zdjec

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.ProgressBar
import android.widget.SeekBar
import android.widget.SeekBar.OnSeekBarChangeListener

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

        reset.setOnClickListener {
            seekbHorizontalp1.progress = 100
            seekbHorizontalp2.progress = 100
            seekbHorizontalp3.progress = 100

            seekbVerticalp1.progress = 100
            seekbVerticalp2.progress = 100
            seekbVerticalp3.progress = 100
        }

        seekbVerticalp1.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture1.scaleY = scale
            }
            override fun onStartTrackingTouch(p0: SeekBar) {}
            override fun onStopTrackingTouch(p0: SeekBar) {}
        })
        seekbHorizontalp1.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture1.scaleX = scale.toFloat()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
        seekbVerticalp2.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture2.scaleY = scale
            }
            override fun onStartTrackingTouch(p0: SeekBar) {}
            override fun onStopTrackingTouch(p0: SeekBar) {}
        })

        seekbHorizontalp2.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture2.scaleX = scale.toFloat()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
        seekbVerticalp3.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture3.scaleY = scale
            }
            override fun onStartTrackingTouch(p0: SeekBar) {}
            override fun onStopTrackingTouch(p0: SeekBar) {}
        })

        seekbHorizontalp3.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture3.scaleX = scale.toFloat()
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })


    }
}