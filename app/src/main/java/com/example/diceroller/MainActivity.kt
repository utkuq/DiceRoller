package com.example.diceroller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
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
            main()

        }
        //main()
    }

    private fun rollDice() {
        val dice = Dice(6)
        val diceRoll = dice.roll()
        val resultRoll = diceRoll.toInt()
        val diceImage :ImageView = findViewById(R.id.imageView)

        when(resultRoll){
            1 -> diceImage.setImageResource(R.drawable.dice_1)
            2 -> diceImage.setImageResource(R.drawable.dice_2)
            3 -> diceImage.setImageResource(R.drawable.dice_3)
            4 -> diceImage.setImageResource(R.drawable.dice_4)
            5 -> diceImage.setImageResource(R.drawable.dice_5)
            6 -> diceImage.setImageResource(R.drawable.dice_6)
        }
        diceImage.contentDescription = diceRoll.toString()

        /*
        if (resultRoll==1){
            val diceImage :ImageView = findViewById(R.id.imageView)
            diceImage.setImageResource(R.drawable.dice_1)
        }else if(resultRoll==2){
            val diceImage :ImageView = findViewById(R.id.imageView)
            diceImage.setImageResource(R.drawable.dice_2)
        }else if (resultRoll==3){
            val diceImage :ImageView = findViewById(R.id.imageView)
            diceImage.setImageResource(R.drawable.dice_3)
        }else if (resultRoll==4){
            val diceImage :ImageView = findViewById(R.id.imageView)
            diceImage.setImageResource(R.drawable.dice_4)
        }else if (resultRoll==5){
            val diceImage :ImageView = findViewById(R.id.imageView)
            diceImage.setImageResource(R.drawable.dice_5)
        }else if (resultRoll==6){
            val diceImage :ImageView = findViewById(R.id.imageView)
            diceImage.setImageResource(R.drawable.dice_6)
        }

         */


        /*

        val resultTextView: TextView = findViewById(R.id.textView)
        resultTextView.text=diceRoll.toString()

         */

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

fun main() {
    val myFirstDice = Dice(6)
    val rollResult = myFirstDice.roll()
    val luckyNumber = 4

    when(rollResult){
        luckyNumber -> println("You Win!")
        1 -> println("So sorry! You rolled a 1. Try again!")
        2 -> println("Sadly, you rolled a 2. Try again!")
        3 -> println("Unfortunately, you rolled a 3. Try again!")
        5 -> println("Don't cry! You rolled a 5. Try again!")
        6 -> println("Apologies! you rolled a 6. Try again!")
    }


    /*
    if (rollResult == luckyNumber) {
        println("You win!")
    } else if (rollResult == 1) {
        println("So sorry! You rolled a 1. Try again!")
    } else if (rollResult == 2) {
        println("Sadly, you rolled a 2. Try again!")
    } else if (rollResult == 3) {
        println("Unfortunately, you rolled a 3. Try again!")
    } else if (rollResult == 5) {
        println("Don't cry! You rolled a 5. Try again!")
    } else {
        println("Apologies! You rolled a 6. Try again!")
    }
    println("Your ${myFirstDice.numSides} sided dice rolled ${rollResult}!")

     */
}