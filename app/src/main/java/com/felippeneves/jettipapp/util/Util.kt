package com.felippeneves.jettipapp.util

fun calculateTotalTip(
    totalBil: Double,
    tipPercentage: Int
): Double {
    return if (totalBil.toString().isNotEmpty() && totalBil > 1)
        (totalBil * tipPercentage) / 100
    else 0.0
}

fun calculateTotalPerPerson(
    totalBil: Double,
    splitBy: Int,
    tipPercentage: Int
): Double {
    val bill = calculateTotalTip(
        totalBil = totalBil,
        tipPercentage = tipPercentage
    ) + totalBil

    return (bill/splitBy)
}