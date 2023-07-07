package com.example.practicalweek1fridayg9

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    lateinit var rollBtn : Button
    lateinit var numberTxt : TextView
    lateinit var diceImage : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        numberTxt = findViewById(R.id.numberTextView)
        diceImage = findViewById(R.id.diceImage)
        rollBtn = findViewById(R.id.rollBtn)

        rollBtn.setOnClickListener { rollDice() }
    }

    private fun rollDice(){
        val randomInt = (1..6).random()
        Toast.makeText( this, "Dice Rolled",Toast.LENGTH_SHORT).show()

        val drawableResources = when(randomInt){
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        }

        diceImage.setImageResource(drawableResources)

        numberTxt = findViewById(R.id.numberTextView)
        numberTxt.text = randomInt.toString()
    }
}