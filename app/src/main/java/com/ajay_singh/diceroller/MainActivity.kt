package com.ajay_singh.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView



class MainActivity : AppCompatActivity() {


    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)

        val rollButton : Button = findViewById(R.id.roll_button)

        rollButton.setOnClickListener{
            rollDice()
        }

    }



    private fun rollDice() {
        var count:Int = 0
        val randomInt = (1..6).random()
        
        val resultText:TextView = findViewById(R.id.resultText)

        val drawableResource = when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        count++
        diceImage.setImageResource(drawableResource)
        if(count > 0) {
            resultText.text = ("You got : " + randomInt).toString()
        }
    }

}
