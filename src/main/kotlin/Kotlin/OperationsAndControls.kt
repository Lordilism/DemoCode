package Kotlin

fun main(){
    val age =10
    when(age){
        in 0..15->{
            println("under 16")
        }
        in 16..29->{
            println("under 30")
        }
        else->{
            println("over 30")
        }
    }
    println("================")


    val number = listOf<Int>(2,4,6,8,9)
    for (i in number){
        println("List : $i")
    }
    println("================")
    for (i in number.indices){
        println("Indices : $i")
    }
    println("================")

    for ((index,value) in number.withIndex()){
        println("Index: $index value: $value")
    }
    println("================")

    for(i in 0..5){
        println(i)
    }
    println("================")





}