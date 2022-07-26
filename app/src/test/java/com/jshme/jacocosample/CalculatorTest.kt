package com.jshme.jacocosample

import org.junit.Assert
import org.junit.Test

class CalculatorTest {
    @Test
    fun testSum() {
        Assert.assertEquals(5, Calculator.sum(2, 3))
    }
}
