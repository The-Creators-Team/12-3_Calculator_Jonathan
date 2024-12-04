package com.example.jonathansnidercalcuatlor

class CalculatorClass {
    enum class EquationEnum {
        DIVIDE, MULTIPLY,SUBTRACT,ADD
    }
    fun performEquation(firstNumber: Int,secondNumber: Int,equationToPerform: EquationEnum): Int
    {
        return when(equationToPerform){
            EquationEnum.DIVIDE -> {
                firstNumber/secondNumber
            }

            EquationEnum.MULTIPLY -> {
                firstNumber*secondNumber
            }

            EquationEnum.SUBTRACT -> {
                firstNumber-secondNumber
            }

            EquationEnum.ADD -> {
                firstNumber+secondNumber
            }
        }
    }
}