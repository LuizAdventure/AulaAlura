package com.example.financas.model

import java.io.Serializable
import java.math.BigDecimal
import java.util.Calendar

class Transacao (
    val value: BigDecimal,
    val category: String,
    val date: Calendar
): Serializable