// Arrays
val nums = arrayOf(1, 2, 3, 4, "Sample")
var SpecificArray = intArrayOf(1, 20, 50, 30)

//Lists or Collections
var listOfNames = listOf<String>("My", "Github Handle is", "abhinav78910")    //List is immutable
var mutableListOfNames = mutableListOf<String>("Hello", "World!")    //List is mutable

//using arrayList
var arrayListSample = arrayListOf<String>("My", "Github Handle is", "abhinav78910")   //ArrayList is mutable

//immutable map
var mapOfNames = mapOf<Int, String>(1 to "Cisco", 2 to "Google")

//for creating generic map
var genericMap = mapOf("name" to "Abhinav", 1 to "Cisco", 2 to 20)

//mutable map
var mutableMap = hashMapOf("name" to "Abhinav", 1 to "Cisco", 2 to 20)
fun main() {
    println(arrayListSample)
    println(listOfNames)
    arrayListSample.add("Testing")
    arrayListSample.add("element")
    arrayListSample.add("addition")
    println(arrayListSample)

    mutableListOfNames.add(2, "You are in Collections_and_loops.kt")
    println(mutableListOfNames)

    println(mapOfNames[1])
    println(genericMap[2])

    mutableMap[3] = "Google"
    println(mutableMap)

    //For each loops - can be run on any type of list (best to use in Kotlin)
    arrayListSample.forEach { it -> println(it) }
    SpecificArray.forEach { it -> println(it) }
    genericMap.forEach { (key, value) -> println("key = $key , Value = $value") }

    //Traditional for loops
    for (num in arrayListSample) {
        println(num)
    }

    for (i in 0..10) {
        // upper limit inclusive
        print("$i ")
    }
    println()
    for (i in 0 until 10) {
        // upper limit exclusive
        print("$i ")
    }

    println()
    for (x in 10 downTo 0) {
        //reverse loop
        print("$x ")
    }

    println()
    for (x in 10 downTo 0 step 2) {
        //reverse loop with step size 2
        print("$x ")
    }

    //Special KeyWords -- https://kotlinlang.org/docs/reference/keyword-reference.html
    var any:Any = "Best In Class Product"
    var anyString: String = any as String

    if(any is String){  //This if statement ensures that any is a String therefore .length can be confidently applied to it
        println(any.length)
    }

    println(anyString)

   when(any){

        "Name" -> {
            println("Abhinav")
        }
        "Branch" -> println("CSE-EV")
        "Year" ->{
            println(2020)
        }
        else -> println("No match found")
    }

}

