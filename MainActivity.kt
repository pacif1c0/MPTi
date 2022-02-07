package com.example.team_project_mpti

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 채팅 기능이 구현이 잘되는지 확인하기 위해 임시로 만들어놓은 경로입니다
        // ---------------------------------------------------------------
        val btnMove : Button = findViewById(R.id.chat)
        val secondIntent = Intent(this, ChatActivity::class.java) // 인텐트를 생성

        btnMove.setOnClickListener { // 버튼 클릭시 할 행동
            startActivity(secondIntent)  // 화면 전환하기
        }
        // ---------------------------------------------------------------

    }
}