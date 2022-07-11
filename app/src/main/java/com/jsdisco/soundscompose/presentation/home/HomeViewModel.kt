package com.jsdisco.soundscompose.presentation.home

import android.util.Log
import androidx.lifecycle.ViewModel
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject


@HiltViewModel
class HomeViewModel @Inject constructor(

) : ViewModel() {

    var test = 0

    init {
        Log.e("HVM", "init")
        test = 1
    }


}