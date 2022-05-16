package com.location.kotlindemo.classes

/* open to set class be extendable */
open class Person(private val name: String, private var age: Int) {

    constructor(): this("unknown", 0) {
    }

    constructor(name: String): this(name, 0) {
    }

    fun getName(): String {
        return this.name
    }

    fun getAge(): Int {
        return this.age
    }

    fun setAge(age: Int) {
        this.age = age
    }

    open fun eat() {
        println("name is $name, he is $age years old")
    }
}