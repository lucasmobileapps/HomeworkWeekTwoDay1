package com.example.homeworkweektwoday1

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_person_object.*

class PersonObject : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_person_object)
    }
    fun onClick(view: View) {
        val person1 = etPerson1.text.toString()
        val person2 = etPerson2.text.toString()
        val person3 = etPerson3.text.toString()
        val person4 = etPerson4.text.toString()
        val list = PersonList(person1, person2, person3, person4)


        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("list", list)
        setResult(Activity.RESULT_OK,intent)
        finish()
    }
}
