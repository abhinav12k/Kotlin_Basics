// Extension  functions allow you to add functions to an existing class
// without having to access its source code.
//The function name is prefixed with the class it operates on.
fun String.hasSpaces(): Boolean {
    val found = this.find { it == ' ' }
    return found != null
}

// the above function can be reduced to
//fun String.hasSpaces() = find{it ==' '} !=null

//Extension functions only have access to the public API of the class they're extending.

//class AquariumPlant(val color: String, private val size: Int) {
//
//    fun AquariumPlant.isRed() = color == "red"    // OK
//    fun AquariumPlant.isBig() = size > 50         // gives error
//}

open class AquariumPlant(val color: String, private val size: Int)

class GreenLeafyPlant(size: Int) : AquariumPlant("green", size)

fun AquariumPlant.print() = println("AquariumPlant")
fun GreenLeafyPlant.print() = println("GreenLeafyPlant")

//Kotlin also lets you add extension properties.
val AquariumPlant.isGreen: Boolean
    get() = color == "green"

//The class you extend is called the receiver, and it is possible to make that class nullable.
fun AquariumPlant?.pull() {
    this?.apply {
        println("removing $this")
    }
}


fun main() {
    println("Does it have spaces?".hasSpaces())


//    val plant = GreenLeafyPlant(size = 10)
//    plant.print()
//    println("\n")
//    val aquariumPlant: AquariumPlant = plant
//    aquariumPlant.print()  // what will it print?   --> Output will  be AquariumPlant because the type is resolved at compile time, so AquariumPlant gets printed.
//    print(plant.isGreen)


    val plant: AquariumPlant? = null
    plant.pull()    //Nothing will be printed as the plant is null
}