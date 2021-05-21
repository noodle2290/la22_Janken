package app.murakami.takuro.janken

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var win = 0
        var draw = 0
        var lose = 0

        gooButton.setOnClickListener {
            player.setImageResource(R.drawable.goo)
            val number: Int = Random.nextInt(3)

            when(number){
                0 -> {
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                    draw += 1
                }
                1 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                    win += 1
                }
                2 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                    lose += 1
                }
            }

            all.text = win.toString() + "勝" + draw.toString() + "分" + lose.toString() + "負"
        }

        chokiButton.setOnClickListener {
            player.setImageResource(R.drawable.choki)
            val number: Int = Random.nextInt(3)

            when(number){
                0 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                    draw += 1
                }
                1 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                    win += 1
                }
                2 -> {
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                    lose += 1
                }
            }
            all.text = win.toString() + "勝" + draw.toString() + "分" + lose.toString() + "負"
        }

        paaButton.setOnClickListener {
            player.setImageResource(R.drawable.paa)
            val number: Int = Random.nextInt(3)

            when(number){
                0 -> {
                    cpu.setImageResource(R.drawable.paa)
                    result.text = "引き分けです"
                    result.setTextColor(Color.parseColor("#8a000000"))
                    draw += 1
                }
                1 -> {
                    cpu.setImageResource(R.drawable.goo)
                    result.text = "あなたの勝ちです"
                    result.setTextColor(Color.parseColor("#f44336"))
                    win += 1
                }
                2 -> {
                    cpu.setImageResource(R.drawable.choki)
                    result.text = "あなたの負けです"
                    result.setTextColor(Color.parseColor("#2196f3"))
                    lose += 1
                }
            }
            all.text = win.toString() + "勝" + draw.toString() + "分" + lose.toString() + "負"
        }
    }
}