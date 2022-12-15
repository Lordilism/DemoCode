package com.example.kotlinbasic.Kotlin
fun sum(a:Int , b:Int):Int{
    return a + b
}

fun sum2(a:Int, b:Int) = a+b  // single expression function inferred the return type

fun sum3(a: Int, b:Int):Unit{
    println("Sum of $a+$b is ${a+b}")           // Unit return
}
fun sum4(a: Int, b:Int){
    println("Sum of $a+$b is ${a+b}")           // Unit return can be omitted
}







fun main(){
//    var data =0.1
//    var data2 =1
//    data = data2.toDouble()
//    data2 =data.toInt()
//
//    Person.getPersonInfo()

    var per:Person?=null
    val name =per?.showName()?:"harry"
    println(name)


    // Setter
    val person =Person()
//    person.name=""
}