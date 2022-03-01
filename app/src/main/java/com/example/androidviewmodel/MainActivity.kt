package com.example.androidviewmodel

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.androidviewmodel.nonparameterviewmodel.MainViewModelNoneParameterized
import com.example.androidviewmodel.parameterizedviewmodel.MainViewModelParameterized
import com.example.androidviewmodel.parameterizedviewmodel.ViewModelFactory
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
	
	lateinit var mainViewModelNoneParameterized: MainViewModelNoneParameterized
	lateinit var mainViewModelParameterized: MainViewModelParameterized
	
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		
		// None parameterized view model
//		noneParameterizedViewModel()
		
		// Parameterized view model
		parameterizedViewModel()
		
	}
	
	fun noneParameterizedViewModel() {
		mainViewModelNoneParameterized =
			ViewModelProvider(this)[MainViewModelNoneParameterized::class.java]
		id_text.text = mainViewModelNoneParameterized.count.toString()
		
		btn_add.setOnClickListener {
			mainViewModelNoneParameterized.setCount()
			id_text.text = mainViewModelNoneParameterized.count.toString()
		}
		
		btn_add.setOnLongClickListener {
			mainViewModelNoneParameterized.count = 0
			id_text.text = mainViewModelNoneParameterized.count.toString()
			true
		}
	}
	
	
	fun parameterizedViewModel() {
		mainViewModelParameterized =
			ViewModelProvider(this, ViewModelFactory(0))[MainViewModelParameterized::class.java]
		id_text.text = mainViewModelParameterized.count.toString()
		btn_add.setOnClickListener {
			mainViewModelParameterized.increment()
			id_text.text = mainViewModelParameterized.count.toString()
		}
		
		btn_add.setOnLongClickListener {
			mainViewModelParameterized.count = 0
			id_text.text = mainViewModelParameterized.count.toString()
			true
		}
	}
	
}