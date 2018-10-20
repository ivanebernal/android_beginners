package com.ivanebernal.week1

import org.junit.Test

import org.junit.Assert.*

class CircleTest {

    val circle = Circle(2.0)

    @Test
    fun calculateArea() {
        assertEquals(12.57, circle.getArea(), 0.01)
    }

    @Test
    fun getNumberOfSides() {
        assertEquals(0, circle.getNumberOfSides())
    }

    @Test
    fun getPerimeter() {
        assertEquals(12.57, circle.getPerimeter(), 0.01)
    }
}