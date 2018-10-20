package com.ivanebernal.week1

import org.junit.Test

import org.junit.Assert.*

class ShapeUtilsTest {
    val circle = Circle(2.0)
    val square = Square(2.0)
    val isosceles = IsoscelesTriangle(2.0, 1.0)
    val equilateral = EquilateralTriangle(2.0)
    val rightAngled = RightAngledTriangle(3.0, 4.0, 5.0)

    @Test
    fun isAreaBigger() {
        assertEquals(ShapeUtils.isAreaBigger(square, circle), true)
    }

    @Test
    fun isPerimeterBigger() {
        assertEquals(ShapeUtils.isPerimeterBigger(circle, rightAngled), true)
    }

    @Test
    fun hasMoreSides() {
        assertEquals(ShapeUtils.isAreaBigger(square, circle), true)
    }
}