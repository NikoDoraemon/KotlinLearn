package com.location.kotlindemo

import com.location.kotlindemo.classes.*
import com.location.kotlindemo.interfaces.Study
import kotlin.math.max

/*
fun main() {
    val a = 10
    var b : Int = 10
    b *= b
    val c = large2(a, b)
    println("Hello Kotlin $c")
    checkNumber(a)
    demoLooper(10)
    val person = Person("Cooper", 18)
    person.eat()

    val student = Student("11235", 100, "Kevin", 17)
    student.eat()
    doStudy(student)

    val cellphoneJava = CellphoneJava("pai", 3.14)
    val cellPhoneKotlin = CellphoneKotlin("pai", 3.14)
    val cellphoneKotlin2 = CellphoneKotlin("pai", 3.14)
    println("java : $cellphoneJava")
    println("kotlin : $cellPhoneKotlin")
    println("is equaled " + (cellphoneKotlin2 == cellPhoneKotlin))

    Singleton.singletonTest()

    listTest()
    mapTest()
}
 */

fun large(arg1 : Int, arg2 : Int) : Int {
    return max(arg1, arg2)
}

fun large2(arg1: Int, arg2: Int) : Int = max(arg1, arg2)

/* if and when */
fun largeIf(arg1: Int, arg2: Int) : Int {

/*
    if (arg1 >= arg2) {
        return arg1;
    } else {
        return arg2;
    }
*/

/* if could return a value */
    return if (arg1 > arg2) {
        arg1
    } else {
        arg2
    }
}

fun getScore(name: String) = when(name) {
    "Tom" -> 86
    "Jim" -> 77
    "Jack" -> 100
    "Cooper" -> 95
    else -> 0
}

fun checkNumber(number : Number) {
    when (number) {
        is Int -> println("number is Int")
        is Double -> println("number is double")
        else -> println("number not support")
     }
}

fun demoLooper(arg : Int) {
    for (i in 0..arg) {
        println(i)
    }

    val rang = 0 until arg
    for (i in rang) {
        println(i)
    }

    for (i in 0 until arg step 2) {
        println(i)
    }

    for (i in arg downTo 0 step 2) {
        println(i)
    }
}

fun doStudy(study: Study?) {
    study?.readBooks()
    study?.doHomework()

    /* simple code */
    study?.let { std ->
        std.doHomework()
        std.readBooks()
    }
}

fun listTest() {
    val list = listOf("Apple", "Banana", "Orange", "Pear")
    for (i in list) {
        println(i)
    }

    val list2 = mutableListOf("Apple", "Banana", "Orange", "Pear")
    list2.add("watermelon")
    for (i in list) {
        print(i)
    }
}

fun mapTest() {
    val map = HashMap<String, Int>()
    map["Apple"] = 1
    map["Banana"] = 2
    map["Pear"] = 3
    map["Grape"] = 4

    for ((fruit, number) in map) {
        println("fruit is $fruit, number is $number")
    }

    val map2 = mapOf("Apple" to 1, "Banana" to 2)
    for ((fruit, number) in map2) {
        println("fruit is $fruit, number is $number")
    }
}

fun lambdaTest() {
    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
    var maxLengthFruit = ""
    for (fruit in list) {
        if (fruit.length > maxLengthFruit.length) {
            maxLengthFruit = fruit
        }
    }
    println("max length fruit is $maxLengthFruit")

    /* equals to next */
    /*
    val lambda = { fruit: String -> fruit.length}
    maxLengthFruit = list.maxBy(lambda)
     */

}