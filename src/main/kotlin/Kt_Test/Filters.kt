package Kt_Test

class Filters {
    fun main(args:Array<String>){

    }
}
fun main(){
    val decorations = listOf ("prock", "pagoda", "plastic" ,"plant", "paragon","alligator", "flowerpot")
    println("Unit-> ${decorations.filter { it[0]=='p' }}")
    val eager= decorations.filter { it[0]=='p' }
    println("variable->$eager")
    val filtered=decorations.asSequence().filter { it[0]=='p' }
    println("asSequence-> ${filtered.toList()}")
    val lazyMap=decorations.asSequence().map {
        println( "From Map $it")
        it
    }
    println("LazyMap-> $lazyMap")
    println("fist element-> ${lazyMap.first()}")
    println("last element-> ${lazyMap.last()}")
    println("all List: ${lazyMap.toList()}")

}