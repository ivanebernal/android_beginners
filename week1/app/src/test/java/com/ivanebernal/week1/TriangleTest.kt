package com.ivanebernal.week1

import org.junit.Test

import org.junit.Assert.*

class TriangleTest {
    val isosceles = IsoscelesTriangle(2.0, 1.0)
    val equilateral = EquilateralTriangle(2.0)
    val rightAngled = RightAngledTriangle(3.0, 4.0, 5.0)

    @Test
    fun calculateAngles() {
        isosceles.calculateAngles()
        assertEquals(41.41, isosceles.angleA, 0.05)
        assertEquals(41.41, isosceles.angleC, 0.05)
        assertEquals(97.18, isosceles.angleB, 0.05)

        equilateral.calculateAngles()
        assertEquals(60.0, equilateral.angleA, 0.00)
        assertEquals(60.0, equilateral.angleB, 0.00)
        assertEquals(60.0, equilateral.angleC, 0.00)

        rightAngled.calculateAngles()
        assertEquals(90.0, equilateral.angleA, 0.00)
        assertEquals(36.87, equilateral.angleB, 0.01)
        assertEquals(53.13, equilateral.angleC, 0.01)
    }

    @Test
    fun calculateArea() {
        assertEquals(0.968, isosceles.getArea(), 0.01)
        assertEquals(1.73, equilateral.getArea(), 0.01)
        assertEquals(6.0, rightAngled.getArea(), 0.00)
    }

    @Test
    fun getNumberOfSides() {
        assertEquals(3, isosceles.getNumberOfSides())
        assertEquals(3, equilateral.getNumberOfSides())
        assertEquals(3, rightAngled.getNumberOfSides())
    }

    @Test
    fun getPerimeter() {
        assertEquals(5.0, isosceles.getPerimeter(), 0.0)
        assertEquals(6.0, equilateral.getPerimeter(), 0.0)
        assertEquals(12.0, rightAngled.getPerimeter(), 0.0)
    }
}