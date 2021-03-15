package jp.techacademy.daiki.ono.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val human = Human("佐藤",20,"サッカー")
        dog.move()
        human.say()
        human.think()

    }
}