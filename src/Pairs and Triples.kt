//List.partition() returns two lists, one with the items where the condition is true,
// and the other for items where the condition is false.

/*
val twoLists = fish.partition { isFreshWater(it) }
println("freshwater: ${twoLists.first}")
println("saltwater: ${twoLists.second}")
*/

//making pairs

/*
We can create a pair by creating an expression connecting two values,such as two strings,
with the keyword to, then using .first or .second to refer to each value.
*/

val equipment = "fish net" to "catching fish"

//making triples

/*You create a triple using Triple() with 3 values. Use .first, .second
 and .third to refer to each value.
*/

val numbers = Triple(7,8,9)


/*
The above examples use same type as a part but the parts could be a string, a number,
or a list, for example—even another pair or triple.
 */

val equipment2 = ("fish net" to "catching fish") to "equipment"

//Destructuring -  means separating pairs and triples into their parts
val equipment3 = "fish net" to "catching fish"
val tool= equipment3.component1()
val use = equipment3.component2()
fun main(){
//    println("${equipment.first} is used to ${equipment.second}")
//    println(numbers.toString())
//    println(numbers.toList())

    println("${equipment2.first} is ${equipment2.second}")
    println("${equipment2.first.second}")


    println("$tool is used for $use")
}


