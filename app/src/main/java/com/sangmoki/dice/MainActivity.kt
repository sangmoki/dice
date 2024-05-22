package com.sangmoki.dice

import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.sangmoki.dice.databinding.ActivityMainBinding
import kotlin.random.Random

class MainActivity : AppCompatActivity() {

    private lateinit var binding : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // DataBinding을 사용하기 위해 DataBindingUtil.setContentView()를 사용
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        // 바인딩을 통해 쉽게 ID를 변수에 담을 수 있다.
        val diceImage1 = binding.dice1
        val diceImage2 = binding.dice2

        // diceStartBtn이라는 Id를 가진 버튼을 클릭 시 실행
        binding.diceStartBtn.setOnClickListener {
            Toast.makeText(this, "주사위 GO!", Toast.LENGTH_LONG).show()

            // 랜덤 함수 사용
            Random.nextInt(1, 6)
            Log.d("MainActivity", "Random number: ${Random.nextInt(1, 6)}")

            val firstDice = Random.nextInt(1, 6)
            val secondDice = Random.nextInt(1, 6)

            // Random 숫자 조건에 따라 이미지 변경
            if (firstDice == 1) {
                diceImage1.setImageResource(R.drawable.dice_1)
            } else if (firstDice == 2) {
                diceImage1.setImageResource(R.drawable.dice_2)
            } else if (firstDice == 3) {
                diceImage1.setImageResource(R.drawable.dice_3)
            } else if (firstDice == 4) {
                diceImage1.setImageResource(R.drawable.dice_4)
            } else if (firstDice == 5) {
                diceImage1.setImageResource(R.drawable.dice_5)
            } else {
                diceImage1.setImageResource(R.drawable.dice_6)
            }

            if (secondDice == 1) {
                diceImage2.setImageResource(R.drawable.dice_1)
            } else if (secondDice == 2) {
                diceImage2.setImageResource(R.drawable.dice_2)
            } else if (secondDice == 3) {
                diceImage2.setImageResource(R.drawable.dice_3)
            } else if (secondDice == 4) {
                diceImage2.setImageResource(R.drawable.dice_4)
            } else if (secondDice == 5) {
                diceImage2.setImageResource(R.drawable.dice_5)
            } else {
                diceImage2.setImageResource(R.drawable.dice_6)
            }
        }
    }
}
