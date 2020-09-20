//Arrays in kotlin

//This creates an array which can store any type of elements
val arr = arrayOf(1,2,3,4,5,"hello","world")

//Explicitly defining type as integer array
val seconds = intArrayOf(10,20,30,40,50)

//array type as string
val nameString = arrayOf<String>("a","n","o","n","y","m","o","u","s")

//By default null cannot be assigned to any array so kotlin provides us with arrayof Nulls
val nullArray = arrayOfNulls<Int>(5)

fun main(){
    println(nameString[5])
    println(seconds.get(2))
    println(arr[6])

    nullArray.set(0,5)
    nullArray.set(2,5)
    println(nullArray[1])
    println(nullArray[0])

}
