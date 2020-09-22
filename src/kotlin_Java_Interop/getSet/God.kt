package kotlin_Java_Interop.getSet

fun main(){

    println("Let's create something")

    var adam = Man()
    var eve = Woman()

    //Using functions of different kotlin files into a kotlin file doesn't create any problem
    adam.name = "Adam"
    eve.name = "Eve"

}