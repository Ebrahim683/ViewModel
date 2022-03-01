package com.example.androidviewmodel.parameterizedviewmodel

import androidx.lifecycle.ViewModel

class MainViewModelParameterized(var value: Int) : ViewModel() {
	
	var count = value
	fun increment() {
		count++
	}
	
}