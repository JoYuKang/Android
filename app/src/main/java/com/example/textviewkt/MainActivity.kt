package com.example.textviewkt

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {    //앱 최초 실행
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)  //xml 뷰 화면 연결

        textView.setText("안녕하세요!")

    }
}