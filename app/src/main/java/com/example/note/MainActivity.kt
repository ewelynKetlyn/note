package com.example.note

import android.app.Activity
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.note.adapter.ItemAdapter
import com.example.note.data.Datasource
import com.example.note.databinding.ActivityMainBinding
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myDataSet = Datasource().loadFrutas()
        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        val buttonSegundaTela = findViewById<Button>(R.id.button_next)

        recyclerView.adapter = ItemAdapter(this, myDataSet)
        recyclerView.setHasFixedSize(true)

        buttonSegundaTela.setOnClickListener{
            IrSegundaTela()
        }
    }
    private fun IrSegundaTela(){
        val segundaTela = Intent(this, TestActivity::class.java)
        startActivity(segundaTela)
    }
}