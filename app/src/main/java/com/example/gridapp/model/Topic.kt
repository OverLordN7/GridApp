package com.example.gridapp.model

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

data class Topic(
    @StringRes val stringResourceId: Int,
    val graceNum : Int,
    @DrawableRes val imageResourceId: Int,
)
