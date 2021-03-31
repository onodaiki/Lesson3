package jp.techacademy.daiki.ono.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val dog = Dog("ポチ", 3)      // 名前をポチ、年齢3歳で、Dogのインスタンスを作る
        val human1 = Human("佐藤",20,"サッカー")

        dog.move()
        human1.say()
        human1.think()
        val human2 = Human("山口",22,"テニス")
        human2.say()
        human2.think()

    }
}