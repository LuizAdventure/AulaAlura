package com.example.financas.extensions

import java.text.SimpleDateFormat
import java.util.*

fun Calendar.formatForBrazil(): String {
    val formatBrazil = "dd/MM/yyyy"
    val format = SimpleDateFormat(formatBrazil)
    val dateformat = format.format(this.time)
    return dateformat


}