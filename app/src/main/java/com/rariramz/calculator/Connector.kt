package com.rariramz.calculator

import android.os.Vibrator
import com.rariramz.calculator.calculations.Calculator


/*
* Интерфейс - почтальон.
* Нужен для получения фрагментом ссылки на экземпляр класса Calculator из MainActivity.
* */
interface Connector {
    fun getCalculator() : Calculator
    fun isDemo() : Boolean
}