package com.asyncan.sharps.model.datatypes

data class CaptchaResponse(
    val png: String,
    val wav: String,
    val uuid: String,
)
