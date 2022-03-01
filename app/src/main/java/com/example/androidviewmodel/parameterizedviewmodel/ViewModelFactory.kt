package com.example.androidviewmodel.parameterizedviewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider

class ViewModelFactory(var counter:Int):ViewModelProvider.Factory {
	override fun <T : ViewModel?> create(modelClass: Class<T>): T {
		return MainViewModelParameterized(counter) as T
	}
}