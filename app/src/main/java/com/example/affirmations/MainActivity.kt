package com.example.affirmations

import android.content.ContentValues.TAG
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import androidx.recyclerview.widget.RecyclerView
import com.example.affirmations.adapter.ItemAdapter
import com.example.affirmations.data.Datasource
import com.example.affirmations.model.Employee

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val addPremium: Button = findViewById(R.id.addPremium)
        val addNormal: Button = findViewById(R.id.addNormal)

        val myDataset = Datasource().loadAffirmations()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.adapter = ItemAdapter(this, myDataset)

        addNormal.setOnClickListener {
            Log.e(TAG, "onCreate: normal")
            val name = findViewById<EditText>(R.id.newName).text.toString()
            val number = findViewById<EditText>(R.id.newNumber).text.toString()
            myDataset.add(Employee(name, number))
            recyclerView.adapter = ItemAdapter(this, myDataset)
        }

        addPremium.setOnClickListener {
            val name = findViewById<EditText>(R.id.newName).text.toString()
            val number = findViewById<EditText>(R.id.newNumber).text.toString()
            myDataset.add(Employee(name, number, true))
            recyclerView.adapter = ItemAdapter(this, myDataset)
        }
    }
}