package com.example.kotlinbasic.Kotlin
val myList= listOf<Int>(1,2,3,4)
val myMutableList = mutableListOf<Int>(1,3,4,2,5)

val mySet = setOf<Int>()    // use to filter the duplicate values
val myMutableSet = mutableSetOf<String>("P","A","D","C")

val myMap = mapOf<Int,String>(1 to "a",2 to "b")
val myMutableMap= mutableMapOf<String,String>("a" to "apple", "b" to "better")



fun main(){
    myMutableList.add(5)
    println("Mutable List : $myMutableList")

    myMutableSet.add("B")
    myMutableSet.add("P")
    println("Mutable Set : $myMutableSet")

    myMutableMap.put("c","car")
    println("Mutable Map: $myMutableMap")




}