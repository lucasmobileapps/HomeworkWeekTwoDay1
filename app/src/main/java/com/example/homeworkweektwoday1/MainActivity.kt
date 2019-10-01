package com.example.homeworkweektwoday1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnTakePicture: Button = findViewById(R.id.btnActPic)
        btnTakePicture.setOnClickListener {
            val intent = Intent(this, TakePicture::class.java)
            startActivity(intent)
        }
        val btnActPerson: Button = findViewById(R.id.btnActPerson)
        btnActPerson.setOnClickListener {
            val intent = Intent(this, PersonObject::class.java)
            startActivity(intent)
        }
        val btnActCalculator: Button = findViewById(R.id.btnActCalculator)
        btnActCalculator.setOnClickListener {
            val intent = Intent(this, EMICalculator::class.java)
            startActivity(intent)
        }


    }

    fun onClick(view: View) {
        when (view.id) {
            R.id.btnActPerson -> {
                //Implicit Intent
                val intent = Intent("get.person.list")
                startActivityForResult(intent, 432)
            }
        }

    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        super.onActivityResult(requestCode, resultCode, data)
        val passedList = intent.getParcelableExtra<PersonList>("list")
        tvPersonList.text = passedList?.Person1
        //tvPersonList.text = "${passedList?.Person1 ?: "NO MAKE"} ${passedList?.Person2}"
        //In JAVA  passedCar== null ? "NO MODEL" : passedCar.getModel()

    }
}
