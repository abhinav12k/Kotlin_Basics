package example.myapp

/*Kotlin creates automatically the getter and setters for the class so we need not to create them separately*/

class Aquarium(var length: Int = 100, open var height: Int = 40, var width: Int=20){
    init {
        println("Initializing Aquarium")
    }
    init {
        println("Second init block")
    }

    constructor(numberOfFishses : Int ) : this(){
        val tank = numberOfFishses *2000*1.1
        height = (tank/(width*length)).toInt()
    }

    var volume: Int
        get() = (length * height *width)/1000
        set(value){
            height = (value *1000)/(length*width)
        }

    fun printSize(){
        println("Width: $width cm "+"Length: $length cm "+"Height: $height cm")
    }
}

