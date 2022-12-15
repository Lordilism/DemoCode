@file:Suppress("UNUSED_EXPRESSION")

import java.util.Random

fun main(args: Array<String>) {
//    fun swim(name: String="Mg Mg"){
//        println("$name is swimming")
//    }
//    swim()
//    swim("Ba Ba")
//    swim(name="Aung Aung")
//    swim()
    fun shouldChangeWater(day: String, temperature:Int , dirty:Int): Boolean{
        return when{
            temperature>30->true
            dirty>30 -> true
            day=="Sunday"-> true
            else->false
        }

    }
    fun randomDay():String{
        val week= arrayOf("SUNDAY","MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY")
        return week[Random().nextInt(week.size)]
    }
    fun fishfoodDay(day:String):String{
       return when(day){
            "SUNDAY"-> "Rice"
            "MONDAY"-> "Cookie"
            "TUESDAY"-> "Coffee"
            "WEDNESDAY"->"LEMON"
            "THURSDAY"-> "FRUIT"
            "FRIDAY"->"BANANA"
            "SATURDAY"-> "GRAPE"

            else-> "Nothing"
        }

    }
    fun feedTheFish(){
        val day= randomDay()
        val fishfoodDay= fishfoodDay(day)
        println("Today is $day and the fish eat $fishfoodDay")
        println("Change Water-> ${shouldChangeWater("Sunday",34,12)}")



    }
    feedTheFish()



}