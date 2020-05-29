package generics

open class WaterSupply(var needsProcessing: Boolean)

class TapWater : WaterSupply(true) {
    fun addChemicalCleaners() {
        needsProcessing = false
    }
}

class fishStoreWater : WaterSupply(false)

class LakeWater : WaterSupply(false) {
    fun filter() {
        needsProcessing = false
    }
}

fun genericExample() {
    val aquarium = Aquarium<TapWater>(TapWater())
    //the above code can be written without specifying the type in angular brackets
    //bcoz kotlin can infer the type from the arguments
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")
    aquarium.waterSupply.addChemicalCleaners()
    println("water needs processing: ${aquarium.waterSupply.needsProcessing}")

    val aquarium4 = Aquarium(LakeWater())
    aquarium4.waterSupply.filter()
    aquarium4.addWater()

}

class Aquarium<T: WaterSupply>(val waterSupply: T) {
    fun addWater() {
        check(!waterSupply.needsProcessing) { "water supply needs processing first" }
        println("adding water from $waterSupply")
    }
}

fun main() {
    genericExample()
}

//For limiting the type T to specific
// <T: Any?> -- for allowing null to be passed
// <T: Any> -- for allowing only non null to be passed
// <T: waterSupply> -- for setting to a particular generic contant

//Adding checks in generic classes
//check() functions are used to check whether the program is beahaving as expected or not
