fun main() {
    println(getName())
    println(square1(5))
//    println(square2(5))
//    println(square3(5))

    getCurrentUser("Baymax",23,true)
    getCurrentUser("Baymax1",20)
    getCurrentUser(age = 50,name = "Demo101",isActive = false)
    getCurrentUser("Ultimate Baymax",26)
    println()
    printMultipleArguments(2,3,54,5,6502,5,1,2,80)
}

//creating a function which returns String
//Best practice to write the function name in lowerCaseCamelLetters
fun getName(): String {
    return "Abhinav"
}

//Method 1 to write functions
fun square1(number: Int): Int {
    return number * number
}

//Method 2 to write functions
//Functions can be even single line and used as an expressions
fun square2(number: Int): Int = number * number

//Method 3
fun square3(number: Int) = number * number

/*
* Types of Arguments->
* *Positional Arguments
* *Default Arguments
* *Named Arguments
* */

fun getCurrentUser(name:String,age:Int,isActive:Boolean = false){
    println("Name $name, Age $age, isActive $isActive")
}

//Using vararg -> multiple arguments
fun printMultipleArguments(vararg number: Int){
    println(number.size)
//    for(num in number)  println(num)
    number.forEach { it-> println(it) }
}