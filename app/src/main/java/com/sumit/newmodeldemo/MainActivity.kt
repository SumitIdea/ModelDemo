package com.sumit.newmodeldemo

import android.annotation.SuppressLint
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import com.google.gson.Gson
import org.json.JSONArray

class MainActivity : AppCompatActivity() {
    var modelList :ArrayList<Model>?=null

    @SuppressLint("SuspiciousIndentation")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val id = findViewById<EditText>(R.id.no)
        val name = findViewById<EditText>(R.id.nm)
        val age = findViewById<EditText>(R.id.age)
        val btn = findViewById<Button>(R.id.btn)

        modelList = ArrayList<Model>()

        btn.setOnClickListener {

            val userId = id.text.toString().trim()
            val userName = name.text.toString().trim()
            val userAge = age.text.toString().trim()
            modelList!! +=  Model(userId,userName,userAge)
            val gson = Gson()
            val json = gson.toJson(modelList)

            Log.e("DAta....", json)
            Log.e("DAta....", modelList?.size.toString())
        }
    }
}