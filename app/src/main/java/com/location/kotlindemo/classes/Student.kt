package com.location.kotlindemo.classes

import com.location.kotlindemo.interfaces.Study

class Student(private val sno: String, private val grade: Int, name: String, age: Int) : Person(name, age), Study {
    init {
        println("sno is $sno and grade is $grade")
    }

    override fun eat() {
        super.eat()
        println("sno is $sno and grade is $grade")
    }

    fun getSno(): String {
        return this.sno
    }

    fun getGrade(): Int {
        return this.grade
    }

    override fun readBooks() {
        println(super.getName() + " is reading books")
    }

    override fun doHomework() {
        println(super.getName() + " is doing homework")
    }
}