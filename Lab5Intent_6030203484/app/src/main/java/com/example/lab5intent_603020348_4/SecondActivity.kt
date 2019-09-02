package com.example.lab5intent_603020348_4

import android.annotation.SuppressLint
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        var data : Bundle? = intent.extras
        var newStudent:Student? = data?.getParcelable<Student>("stdData")
        idText.text = "รหัสนักศึกษา : ${newStudent?.id}"
        nameText.text = "ชื่อ - สกุล : ${newStudent?.name}"
        ageText.text = "อายุ : ${newStudent?.age}"
    }
    fun onClickClose(view: View){
        finish()
    }
}
