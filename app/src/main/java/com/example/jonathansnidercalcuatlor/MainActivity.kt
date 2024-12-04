package com.example.jonathansnidercalcuatlor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.jonathansnidercalcuatlor.databinding.ActivityMainBinding
import com.example.jonathansnidercalcuatlor.ui.theme.JonathanSniderCalcuatlorTheme

class MainActivity : ComponentActivity() {

    private var calcInstance=CalculatorClass()
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        //var test=calcInstance.performEquation(2,3,CalculatorClass.EquationEnum.ADD)

    }
}