package com.ivanebernal.week1

import org.junit.Test

import org.junit.Assert.*

class SquareTest {

    val square = Square(2.0)

    @Test
    fun calculateArea() {
        assertEquals(4, square.getArea())
    }

    @Test
    fun getNumberOfSides() {
        assertEquals(4, square.getNumberOfSides())
    }

    @Test
    fun getPerimeter() {
        assertEquals(8, square.getPerimeter())
    }
}