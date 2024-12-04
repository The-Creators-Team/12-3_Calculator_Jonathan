package com.example.jonathansnidercalcuatlor

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class CalculatorViewModel : ViewModel() {
    private val _calculationString = MutableLiveData<String>().apply {
        value = ""
    }
    private val _numberString1 = MutableLiveData<String>().apply {
        value = ""
    }
    private val _numberString2 = MutableLiveData<String>().apply {
        value = ""
    }

    private val _operatorAdded = MutableLiveData<Boolean>().apply {
        value = false
    }

    var calculationString: MutableLiveData<String> = _calculationString
    var numberString1: MutableLiveData<String> = _numberString1
    var numberString2: MutableLiveData<String> = _numberString2
    var operatorAdded: MutableLiveData<Boolean> = _operatorAdded

    fun addOperatorToCalcString(stringToAdd: String) {
        calculationString.value += stringToAdd
        operatorAdded.value = true
    }

    fun addNumberToNumberString(stringToAdd: String) {
        if (operatorAdded.value == false)
        {
                numberString1.value += stringToAdd
            calculationString.value += stringToAdd
        } else
        {
                numberString2.value += stringToAdd
            calculationString.value += stringToAdd
        }
    }
}