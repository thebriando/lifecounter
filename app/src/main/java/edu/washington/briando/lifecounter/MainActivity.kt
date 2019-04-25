package edu.washington.briando.lifecounter

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var gameStatus = findViewById<TextView>(R.id.status)

        for (i in 1..4) {
            var plusBtn = resources.getIdentifier("p" + i + "Plus", "id", packageName)
            var minusBtn = resources.getIdentifier("p" + i + "Minus", "id", packageName)
            var plus5Btn = resources.getIdentifier("p" + i + "Plus5", "id", packageName)
            var minus5Btn = resources.getIdentifier("p" + i + "Minus5", "id", packageName)

            findViewById<Button>(plusBtn).setOnClickListener {
                var liveID = resources.getIdentifier("p" + i + "Lives", "id", packageName)
                var lives = findViewById<TextView>(liveID)
                var status = Integer.parseInt(lives.text.toString()) + 1
                lives.text = status.toString()
                if (Integer.parseInt(lives.text.toString()) <= 0) {
                    updateGame(i, gameStatus)
                }
            }

            findViewById<Button>(minusBtn).setOnClickListener {
                var liveID = resources.getIdentifier("p" + i + "Lives", "id", packageName)
                var lives = findViewById<TextView>(liveID)
                var status = Integer.parseInt(lives.text.toString()) - 1
                lives.text = status.toString()
                if (Integer.parseInt(lives.text.toString()) <= 0) {
                    updateGame(i, gameStatus)
                }
            }

            findViewById<Button>(plus5Btn).setOnClickListener {
                var liveID = resources.getIdentifier("p" + i + "Lives", "id", packageName)
                var lives = findViewById<TextView>(liveID)
                var status = Integer.parseInt(lives.text.toString()) + 5
                lives.text = status.toString()
                if (Integer.parseInt(lives.text.toString()) <= 0) {
                    updateGame(i, gameStatus)
                }
            }

            findViewById<Button>(minus5Btn).setOnClickListener {
                var liveID = resources.getIdentifier("p" + i + "Lives", "id", packageName)
                var lives = findViewById<TextView>(liveID)
                var status = Integer.parseInt(lives.text.toString()) - 5
                lives.text = status.toString()
                if (Integer.parseInt(lives.text.toString()) <= 0) {
                    updateGame(i, gameStatus)
                }
            }
        }
    }

    private fun updateGame(i: Int, gameStatus: TextView) {
        gameStatus.text = "Player " + i + " LOSES!"
    }
}
