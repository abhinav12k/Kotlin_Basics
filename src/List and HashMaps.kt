
//List -> two types- mutable/list
//Mutable List has various functions like add(), remove(), reversed, contains(), subList()

//lists created by listOf are not mutable means changes cannot be performed on that
val list = listOf(0,1,35,5);

val list2 = listOf("a","b","hi","nav")
//lists created by mutableListOf are mutable and can be modified.

//HashMaps
//HashMaps can be created using the function hashMapOf
val cures = hashMapOf("white spots" to "Ich", "red sores" to "hole disease")

//Maps can also be made mutable using the function mutableMapOf
val inventory = mutableMapOf("fish net" to 1)


fun main(){
    println(list)
    println(list.sum())     // .sum() can be used to calculate the sum of the list items
//    println(list2.sum())    //This will prompt an error because there is not predefined method for calculating sum of strings.
    println(list2.sumBy { it.length })  //Now this will calculate the sum of the list of strings as we strictly defined how to do that.

//    List can be iterated as ->
    for(s in list2.listIterator()){
        print("$s")
    }

    //HashMap
    println(cures.get("white spots"))   //.get() used to get a value for the key mentioned
    println(cures["red sores"])

    //If the mentioned key is not present then map will return null
    println(cures["Covid 19"])

    //If the key is not present we can use getOrDefault/ getOrElse  functions
    println(cures.getOrDefault("Covid 19","sorry i don't know"))
    println(cures.getOrElse("AIDS",{"Sorry the record is not present"}))    //the second argument need to be a variable

    inventory.put("tank scrubber", 3)
    println(inventory.toString())
    inventory.remove("fish net")
    println(inventory.toString())
}
