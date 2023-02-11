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
        val  progressBarHorizontal = findViewById<ProgressBar>(R.id.progressBarWidth)
        val  progressBarVertical = findViewById<ProgressBar>(R.id.progressBarHeight)

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

                ChangeProgressBarValueVertical(seekbVerticalp1,seekbVerticalp2,seekbVerticalp3,progressBarVertical)
            }
            override fun onStartTrackingTouch(p0: SeekBar) {}
            override fun onStopTrackingTouch(p0: SeekBar) {}
        })
        seekbHorizontalp1.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture1.scaleX = scale

                ChangeProgressBarValueHorizontal(seekbHorizontalp1,seekbHorizontalp2, seekbHorizontalp3, progressBarHorizontal)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
        seekbVerticalp2.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture2.scaleY = scale
                ChangeProgressBarValueVertical(seekbVerticalp1,seekbVerticalp2,seekbVerticalp3,progressBarVertical)
            }
            override fun onStartTrackingTouch(p0: SeekBar) {}
            override fun onStopTrackingTouch(p0: SeekBar) {}
        })

        seekbHorizontalp2.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture2.scaleX = scale

                ChangeProgressBarValueHorizontal(seekbHorizontalp1,seekbHorizontalp2, seekbHorizontalp3, progressBarHorizontal)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })
        seekbVerticalp3.setOnSeekBarChangeListener(object : OnSeekBarChangeListener {
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture3.scaleY = scale

                ChangeProgressBarValueVertical(seekbVerticalp1,seekbVerticalp2,seekbVerticalp3,progressBarVertical)
            }
            override fun onStartTrackingTouch(p0: SeekBar) {}
            override fun onStopTrackingTouch(p0: SeekBar) {}
        })

        seekbHorizontalp3.setOnSeekBarChangeListener(object : OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar, progress: Int, fromUser: Boolean) {
                val scale = progress/100f
                picture3.scaleX = scale
                ChangeProgressBarValueHorizontal(seekbHorizontalp1,seekbHorizontalp2, seekbHorizontalp3, progressBarHorizontal)
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {}
            override fun onStopTrackingTouch(p0: SeekBar?) {}
        })

    }
    fun ChangeProgressBarValueHorizontal(seekbar1: SeekBar,seekbar2: SeekBar,seekbar3: SeekBar, progressBar: ProgressBar){
        progressBar.progress = (seekbar1.progress + seekbar2.progress + seekbar3.progress)/3;
    }

    fun ChangeProgressBarValueVertical(seekbar1: SeekBar,seekbar2: SeekBar,seekbar3: SeekBar, progressBar: ProgressBar){
        progressBar.progress = (seekbar1.progress + seekbar2.progress + seekbar3.progress)/3;
    }
}