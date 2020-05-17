package com.ajay_singh.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private lateinit var diceImage1 : ImageView
    private lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage1 = findViewById(R.id.dice_image1)
        diceImage2 = findViewById(R.id.dice_image2)


        val rollButton : Button = findViewById(R.id.roll_button)
        val clearButton : Button = findViewById(R.id.clear_button)

        rollButton.setOnClickListener{
            rollDice()
        }

        clearButton.setOnClickListener{
            clearDice()
        }
    }

    private fun rollDice() {

        val resultText1 : TextView = findViewById(R.id.textView1)
        val resultText2 : TextView = findViewById(R.id.textView2)

        var count : Int = 0
        count++
        var randomOne : Int = (1..6).random()
        val drawableResource1 = when (randomOne) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        if(count > 0) {
            resultText1.text = randomOne.toString()
        }
        diceImage1.setImageResource(drawableResource1)

        var randomTwo : Int = (1..6).random()
        val drawableResource2 = when(randomTwo) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }
        if(count > 0) {
            resultText2.text = randomTwo.toString()
        }
        diceImage2.setImageResource(drawableResource2)

    }

    private fun clearDice() {
        diceImage1.setImageResource(R.drawable.empty_dice)
        diceImage2.setImageResource(R.drawable.empty_dice)
    }
}
