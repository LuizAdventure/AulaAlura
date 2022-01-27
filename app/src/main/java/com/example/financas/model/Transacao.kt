package com.example.financas.model

import java.math.BigDecimal
import java.util.Calendar

class Transacao (
    value: BigDecimal,
    category: String,
    date: Calendar
){

    private val value: BigDecimal = value
    private val category: String = category
    private val date: Calendar = date

    fun getvalue(): BigDecimal{
        return value
    }
}