package com.example.activity_transition

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //MainActivityからNextActivityに遷移するための処理
        changeButton.setOnClickListener {
            //Intentクラスのインスタンスを生成
            val intent = Intent(this,NextActivity::class.java)
            //アクティビティを起動する
            startActivity(intent)
        }

    }
}
