package com.example.kotlinbasic.Kotlin

open class Person(name : String){
//    var name ="Mg Mg"

    open fun eat(){

    }
    open fun sleep(){

    }
    open fun work(){

    }

    constructor():this(name = "") //Secondary Constructor
    init {
        // init Block
        name
    }

    fun doSomthing(){

    }



    companion object{
        val email:String? = null
        fun getPersonInfo()
        {
            //1
            if (email !=null)
            {
                //null safe
            }
            //2
            email?.let {

                //if null, cannot enter the let block
            }
            //3
            val data = email ?: "Null"  //Null safe
            fun showName(): String{
                val name = ""
                return name
            }


        }

    }
    fun showName(): String{
        val name:String? = null
        return name!!
    }
}
fun main(){
//    val b: String? =null
//    val l= b!!. length
    val name =Person().showName()!!
}