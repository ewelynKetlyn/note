package com.example.note.data

import com.example.note.R
import com.example.note.model.frutas

class Datasource {
    fun loadFrutas(): List<frutas>{
        return listOf<frutas>(
            frutas(R.string.f1, R.drawable.img_1),
            frutas(R.string.f2, R.drawable.img_2),
            frutas(R.string.f3, R.drawable.img_3),
            frutas(R.string.f4, R.drawable.img_4)
        )
    }
}