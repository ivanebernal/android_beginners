package com.ivanebernal.week1

abstract class Triangle(val sideA: Double, val sideB: Double, val sideC: Double): Shape {
    var angleA: Double = 0.0
    var angleB: Double = 0.0
    var angleC: Double = 0.0

    abstract fun calculateAngles()
    abstract fun isTriangleValid()

    override fun getArea(): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getNumberOfSides(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getPerimeter(): Double {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}