package com.example.motosinfo.data

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes
import com.example.motosinfo.R

data class Moto(
    @DrawableRes val imageResourceId: Int,
    @StringRes val name: Int,
    val detail: Int,
    @StringRes val description: Int
)
val motos = listOf(
    Moto(R.drawable.honda_1, R.string.moto_name_1, R.string.moto_detail_1, R.string.moto_description_1),
    Moto(R.drawable.honda_2, R.string.moto_name_2, R.string.moto_detail_2, R.string.moto_description_2),
    Moto(R.drawable.yamaha_3, R.string.moto_name_3, R.string.moto_detail_3, R.string.moto_description_3),
    Moto(R.drawable.yamaha_4, R.string.moto_name_4, R.string.moto_detail_4, R.string.moto_description_4),
    Moto(R.drawable.benelli_5, R.string.moto_name_5, R.string.moto_detail_5, R.string.moto_description_5),
    Moto(R.drawable.honda_6, R.string.moto_name_6, R.string.moto_detail_6, R.string.moto_description_6),
    Moto(R.drawable.hero_7, R.string.moto_name_7, R.string.moto_detail_7, R.string.moto_description_7),
    Moto(R.drawable.hero_8, R.string.moto_name_8, R.string.moto_detail_8, R.string.moto_description_8),
    Moto(R.drawable.ktm_9, R.string.moto_name_9, R.string.moto_detail_9, R.string.moto_description_9),
    Moto(R.drawable.ktm_10, R.string.moto_name_10, R.string.moto_detail_10, R.string.moto_description_10),
    Moto(R.drawable.pulsar_11, R.string.moto_name_11, R.string.moto_detail_11, R.string.moto_description_11),
    Moto(R.drawable.pulsar_12, R.string.moto_name_12, R.string.moto_detail_12, R.string.moto_description_12),
    Moto(R.drawable.pulsar_13, R.string.moto_name_13, R.string.moto_detail_13, R.string.moto_description_13),
    Moto(R.drawable.pulsar_14, R.string.moto_name_14, R.string.moto_detail_14, R.string.moto_description_14),
)