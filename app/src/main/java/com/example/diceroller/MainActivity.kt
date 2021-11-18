package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatDelegate
import androidx.appcompat.app.AppCompatDelegate.MODE_NIGHT_NO

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        AppCompatDelegate.setDefaultNightMode(MODE_NIGHT_NO)
        val rollButton : Button = findViewById(R.id.button)
        rollButton.setOnClickListener {
            val toast = Toast.makeText(this,"Dice Rolled!", Toast.LENGTH_SHORT).show()
            rollDice()
        }
        //main()
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text=diceRoll.toString()

    }
}

/*
fun main(){
    val myFirstDice = Dice(6)
    println("Your ${myFirstDice.numSides} sided dice rolled ${myFirstDice.roll()}")
    val mySecondDice = Dice(20)
    println("Your ${myFirstDice.numSides} sided dice rolled ${mySecondDice.roll()}")
}

 */

class Dice(val numSides: Int){
    fun roll(): Int{
        return(1..numSides).random()
    }
}