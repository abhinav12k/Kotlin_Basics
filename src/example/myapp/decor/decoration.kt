package example.myapp.decor

/*
A data class is similar to a struct in some other languages—it exists mainly to hold some
data—but a data class object is still an object. Kotlin data class objects have some extra
benefits, such as utilities for printing and copying. In this task, you create a simple data
class and learn about the support Kotlin provides for data classes.
 */

//To make Decoration a data class, prefix the class declaration with the keyword data.

data class Decoration(val rocks: String){

}

fun makeDecorations(){
    val decorations1 = Decoration("granite")
    println(decorations1)
    val decoration2 = Decoration("slate")
    println(decoration2)

    val decoration3 = Decoration("slate")
    println(decoration3)

    println(decorations1.equals(decoration2));
    println(decoration2.equals(decoration3))

}

// Here is a data class with 3 properties.
data class Decoration2(val rocks: String, val wood: String, val diver: String){
}

fun makeDecorations1() {
    val d5 = Decoration2("crystal", "wood", "diver")
    println(d5)

// Assign all properties to variables.
    val (rock, wood, diver) = d5
    println(rock)
    println(wood)
    println(diver)
}


//Using enums in kotlin!
enum class Color(val rgb: Int){
    RED(20),GREEN(40),BLUE(60)
}

//Sealed class- A class that can only be subclassed within the same file
sealed class Seal
class SeaLion: Seal()
class Walrus: Seal()

fun matchSeal(seal: Seal): String{
    return when(seal){
        is Walrus -> "Walrus"
        is SeaLion -> "Sea Lion"
    }
}

fun main(){
//    makeDecorations()
//    makeDecorations1()
    println(Color.BLUE.name)
    println(Color.GREEN.ordinal)
    println(Color.RED.rgb)
}
