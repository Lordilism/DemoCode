package com.example.kotlinbasic.Kotlin

//val value4 :String Error
//var value5: String  Error

lateinit var value3 : String
fun main(){
    println("Hello Kotlin")
    val value ="Read only"
//    value = "Write" => Error
    var value2 = "Read and Write"
    value2= "Assign"
    value3= "Assign me"  // Assign lateinit var before use

    print(value3)

}