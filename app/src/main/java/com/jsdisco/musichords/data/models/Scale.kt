package com.jsdisco.musichords.data.models

data class Scale(
    val root: String,
    val major: List<String>,
    val minor: List<String>,
    val accMajor: String,
    val accMinor: String
)