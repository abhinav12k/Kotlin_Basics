// Arrays
val nums = arrayOf(1,2,3,4,"Sample")
var SpecificArray = intArrayOf(1,20,50,30)

//Lists or Collections
var listOfNames = listOf<String>("My","Github Handle is","abhinav78910")    //List is immutable
var mutableListOfNames = mutableListOf<String>("Hello","World!")    //List is mutable
//using arrayList
var arrayListSample = arrayListOf<String>("My","Github Handle is","abhinav78910")   //ArrayList is mutable
//immutable map
var mapOfNames = mapOf<Int,String>(1 to "Cisco",2 to "Google")
//for creating generic map
var genericMap = mapOf("name" to "Abhinav",1 to "Cisco",2 to 20)
//mutable map
var mutableMap = hashMapOf("name" to "Abhinav",1 to "Cisco",2 to 20)
fun main(){
    println(arrayListSample)
    println(listOfNames)
    arrayListSample.add("Testing")
    arrayListSample.add("element")
    arrayListSample.add("addition")
    println(arrayListSample)

    mutableListOfNames.add(2,"You are in Collections.kt")
    println(mutableListOfNames)

    println(mapOfNames[1])
    println(genericMap[2])

    mutableMap[3] = "Google"
    println(mutableMap)

    //For each loops - can be run on any type of list
    arrayListSample.forEach { it -> println(it) }
    SpecificArray.forEach { it -> println(it) }
    genericMap.forEach{ (key, value) -> println("key = $key , Value = $value")}

}

