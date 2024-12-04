package com.example.jonathansnidercalcuatlor

import android.os.Bundle
import android.view.View
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

    private var calcInstance = CalculatorClass()
    private lateinit var binding: ActivityMainBinding
    private var numberString1 = ""
    private var numberString2 = ""
    private var number1: Float? = null
    private var number2: Float? = null
    var calculationString = " "

    private var operatorAdded = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val root: View = binding.root
        binding.apply {
            calculatorText.text = calculationString

            calcButtonDivide.setOnClickListener {
                if (!operatorAdded)
                    calcInstance.equationEnum = CalculatorClass.EquationEnum.DIVIDE.also {
                        calculationString += "/"
                        calculatorText.text = calculationString
                    }
                operatorAdded = true
            }

            calcButtonMultiply.setOnClickListener {
                if (!operatorAdded)
                    calcInstance.equationEnum = CalculatorClass.EquationEnum.MULTIPLY.also {
                        calculationString += "X"
                        calculatorText.text = calculationString
                    }
                operatorAdded = true
            }

            calcButtonMinus.setOnClickListener {
                if (!operatorAdded)
                    calcInstance.equationEnum = CalculatorClass.EquationEnum.SUBTRACT.also {
                        calculationString += "-"
                        calculatorText.text = calculationString
                    }
                operatorAdded = true
            }

            calcButtonAdd.setOnClickListener {
                if (!operatorAdded)
                    calcInstance.equationEnum = CalculatorClass.EquationEnum.ADD.also {
                        calculationString += "+"
                        calculatorText.text = calculationString
                    }
                operatorAdded = true
            }

            valueButton0.setOnClickListener {
                if (!operatorAdded) {

                    if (!numberString1.equals("")) {

                        numberString1 += "0"
                        calculationString += "0"
                        calculatorText.text = calculationString
                    }
                } else {
                    if (!numberString2.equals("")) {
                        numberString2 += "0"
                        calculationString += "0"
                        calculatorText.text = calculationString
                    }
                }
            }

            valueButton1.setOnClickListener {
                if (!operatorAdded) {
                    numberString1 += "1"
                    calculationString += "1"
                    calculatorText.text = calculationString
                } else {
                    numberString2 += "1"
                    calculationString += "1"
                    calculatorText.text = calculationString
                }
            }
            valueButton2.setOnClickListener {
                if (!operatorAdded) {
                    numberString2 += "2"
                    calculationString += "2"
                    calculatorText.text = calculationString
                } else {
                    numberString2 += "2"
                    calculationString += "2"
                    calculatorText.text = calculationString
                }
            }
            valueButton3.setOnClickListener {
                if (!operatorAdded) {
                    numberString1 += "3"
                    calculationString += "3"
                    calculatorText.text = calculationString
                } else {
                    numberString2 += "3"
                    calculationString += "3"
                    calculatorText.text = calculationString
                }
            }
            valueButton4.setOnClickListener {
                if (!operatorAdded) {
                    numberString1 += "4"
                    calculationString += "4"
                    calculatorText.text = calculationString
                } else {
                    numberString2 += "4"
                    calculationString += "4"
                    calculatorText.text = calculationString
                }
            }
            valueButton5.setOnClickListener {
                if (!operatorAdded) {
                    numberString1 += "5"
                    calculationString += "5"
                    calculatorText.text = calculationString
                } else {
                    numberString2 += "5"
                    calculationString += "5"
                    calculatorText.text = calculationString
                }
            }
            valueButton6.setOnClickListener {
                if (!operatorAdded) {
                    numberString1 += "6"
                    calculationString += "6"
                    calculatorText.text = calculationString
                } else {
                    numberString2 += "6"
                    calculationString += "6"
                    calculatorText.text = calculationString
                }
            }
            valueButton7.setOnClickListener {
                if (!operatorAdded) {
                    numberString1 += "7"
                    calculationString += "7"
                    calculatorText.text = calculationString
                } else {
                    numberString2 += "7"
                    calculationString += "7"
                    calculatorText.text = calculationString
                }
            }
            valueButton8.setOnClickListener {
                if (!operatorAdded) {
                    numberString1 += "8"
                    calculationString += "8"
                    calculatorText.text = calculationString
                } else {
                    numberString2 += "8"
                    calculationString += "8"
                    calculatorText.text = calculationString
                }
            }
            valueButton9.setOnClickListener {
                if (!operatorAdded) {
                    numberString1 += "9"
                    calculationString += "9"
                    calculatorText.text = calculationString
                } else {
                    numberString2 += "9"
                    calculationString += "9"
                    calculatorText.text = calculationString
                }
            }
            calcButtonEqual.setOnClickListener {
                calculatorText.text = calcInstance.performEquation(
                    numberString1.toFloat(),
                    numberString2.toFloat(),
                    calcInstance.equationEnum
                )
                numberString1 = ""
                numberString2 = ""
                calculationString = ""
                operatorAdded = false
            }

        }

    }


}
