package com.example.note.model

import android.widget.ImageView
import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class frutas(
    @StringRes val stringResourceId: Int,
    @DrawableRes val imageResourceId: Int
    )