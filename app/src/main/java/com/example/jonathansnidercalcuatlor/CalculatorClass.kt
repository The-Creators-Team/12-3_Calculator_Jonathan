package com.example.jonathansnidercalcuatlor

import android.media.audiofx.DynamicsProcessing.Eq

class CalculatorClass {
    enum class EquationEnum {
        DIVIDE, MULTIPLY,SUBTRACT,ADD
    }
    var equationEnum=EquationEnum.DIVIDE
    fun performEquation(firstNumber: Float?,secondNumber: Float?,equationToPerform: EquationEnum): String
    {
        if(firstNumber==null || secondNumber==null)
        {
            return "ERROR"
        }
        return when(equationToPerform){
            EquationEnum.DIVIDE -> {
                (firstNumber/secondNumber).toString()
            }

            EquationEnum.MULTIPLY -> {
                (firstNumber*secondNumber).toString()
            }

            EquationEnum.SUBTRACT -> {
                (firstNumber-secondNumber).toString()
            }

            EquationEnum.ADD -> {
                (firstNumber+secondNumber).toString()
            }
        }
    }
}