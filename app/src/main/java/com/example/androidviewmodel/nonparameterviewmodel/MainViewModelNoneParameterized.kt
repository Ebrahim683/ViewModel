package com.example.androidviewmodel.nonparameterviewmodel

import androidx.lifecycle.ViewModel

class MainViewModelNoneParameterized : ViewModel() {
	var count = 0
	fun setCount() {
		count++
	}
	
}