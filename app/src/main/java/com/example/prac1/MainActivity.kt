package com.example.prac1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    lateinit var diceImage : ImageView // lateinit can not need object first
    lateinit var diceImage2 : ImageView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        diceImage = findViewById(R.id.dice_image)
        diceImage2 = findViewById(R.id.dice_image1)

        val rollButton: Button = findViewById(R.id.roll_button)
        rollButton.setOnClickListener { rollDice() }
    }



    private fun rollDice(){

        diceImage.setImageResource(getRandomDiceImage())
        diceImage2.setImageResource(getRandomDiceImage())
//        val diceImage: ImageView = findViewById(R.id.dice_image)
//
//        val randomInt = (1..6).random()
//
//        val drawableResource = when (randomInt) {
//            1 -> R.drawable.dice_1
//            2 -> R.drawable.dice_2
//            3 -> R.drawable.dice_3
//            4 -> R.drawable.dice_4
//            5 -> R.drawable.dice_5
//            else -> R.drawable.dice_6
//        }
//       diceImage.setImageResource(drawableResource)

     //   diceImage.setImageResource(imagerand())
    }

    private fun getRandomDiceImage() : Int {
        val randomInt = (1..6).random()

        return when (randomInt) {
            1 -> R.drawable.dice_1
            2 -> R.drawable.dice_2
            3 -> R.drawable.dice_3
            4 -> R.drawable.dice_4
            5 -> R.drawable.dice_5
            else -> R.drawable.dice_6
        } }

//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        setContentView(R.layout.activity_main)
//
//        val rollButton: Button = findViewById(R.id.roll_button)
//        rollButton.setOnClickListener { rollDice() }
//    }
//
//    private fun rollDice(){
//
//        val rollText: TextView = findViewById(R.id.result_text)
//        val randomInt = (1..6).random()
//        rollText.text = randomInt.toString()
//        Toast.makeText(this, "button clicked",
//            Toast.LENGTH_SHORT).show()
//    }
//
//    private fun countUp(){
//
//        val resultText: TextView = findViewById(R.id.result_text)
//
//        if(resultText.text == "Hallo World!"){
//            resultText.text = "1"
//        }else{
//            var resultInt = resultText.text.toString().toInt()
//
//            if(resultInt < 6){
//                resultInt++
//                resultText.text = resultInt.toString()
//            }
//        }
//
//    }
}
