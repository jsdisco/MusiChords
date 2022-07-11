package com.jsdisco.soundscompose.data.models

data class Note(
    val midiKey: Int,
    val octave: Int,
    val name: String,
    val displayName: String
)