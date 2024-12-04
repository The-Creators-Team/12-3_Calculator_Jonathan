package com.example.jonathansnidercalcuatlor

import android.os.Bundle
import android.view.View
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
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

    private val calcViewModel: CalculatorViewModel by viewModels()
    //calculationString
    //numberString1
    //numberString2
    //operater added bool

/*    inflater: LayoutInflater,
    container: ViewGroup?,
    savedInstanceState: Bundle?
    ): View {
        val notificationsViewModel =
            ViewModelProvider(this).get(NotificationsViewModel::class.java)*/

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val root: View = binding.root
        binding.apply {
            calculatorText.text = calcViewModel.calculationString.value

            calcButtonDivide.setOnClickListener {
                if (calcViewModel.operatorAdded.value==false)
                    calcInstance.equationEnum = CalculatorClass.EquationEnum.DIVIDE.also {
                        calcViewModel.addOperatorToCalcString("/")
                        calculatorText.text = calcViewModel.calculationString.value
                    }
            }

            calcButtonMultiply.setOnClickListener {
                if (calcViewModel.operatorAdded.value==false)
                    calcInstance.equationEnum = CalculatorClass.EquationEnum.MULTIPLY.also {
                        calcViewModel.addOperatorToCalcString("X")
                        calculatorText.text = calcViewModel.calculationString.value
                    }
            }

            calcButtonMinus.setOnClickListener {
                if (calcViewModel.operatorAdded.value==false)
                    calcInstance.equationEnum = CalculatorClass.EquationEnum.SUBTRACT.also {
                        calcViewModel.addOperatorToCalcString("-")
                        calculatorText.text = calcViewModel.calculationString.value
                    }
            }

            calcButtonAdd.setOnClickListener {
                if (calcViewModel.operatorAdded.value==false)
                    calcInstance.equationEnum = CalculatorClass.EquationEnum.ADD.also {
                        calcViewModel.addOperatorToCalcString("+")
                        calculatorText.text = calcViewModel.calculationString.value
                    }
            }

            valueButton0.setOnClickListener {
                calcViewModel.addNumberToNumberString("0")
                calculatorText.text = calcViewModel.calculationString.value

            }

            valueButton1.setOnClickListener {
                calcViewModel.addNumberToNumberString("1")
                calculatorText.text = calcViewModel.calculationString.value
            }
            valueButton2.setOnClickListener {
                calcViewModel.addNumberToNumberString("2")
                calculatorText.text = calcViewModel.calculationString.value
            }
            valueButton3.setOnClickListener {
                calcViewModel.addNumberToNumberString("3")
                calculatorText.text = calcViewModel.calculationString.value
            }
            valueButton4.setOnClickListener {
                calcViewModel.addNumberToNumberString("4")
                calculatorText.text = calcViewModel.calculationString.value
            }
            valueButton5.setOnClickListener {
                calcViewModel.addNumberToNumberString("5")
                calculatorText.text = calcViewModel.calculationString.value
            }
            valueButton6.setOnClickListener {
                calcViewModel.addNumberToNumberString("6")
                calculatorText.text = calcViewModel.calculationString.value
            }
            valueButton7.setOnClickListener {
                calcViewModel.addNumberToNumberString("7")
                calculatorText.text = calcViewModel.calculationString.value
            }
            valueButton8.setOnClickListener {
                calcViewModel.addNumberToNumberString("8")
                calculatorText.text = calcViewModel.calculationString.value
            }
            valueButton9.setOnClickListener {
                calcViewModel.addNumberToNumberString("9")
                calculatorText.text = calcViewModel.calculationString.value
            }
            calcButtonEqual.setOnClickListener {
                calculatorText.text = calcInstance.performEquation(

                    calcViewModel.numberString1.value?.toFloat(),
                    calcViewModel.numberString2.value?.toFloat(),
                    calcInstance.equationEnum
                )
            }

        }

    }


}
