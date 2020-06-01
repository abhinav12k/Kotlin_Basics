package exampleAnnotations

import kotlin.reflect.full.declaredMemberFunctions

class Plant(){
    fun trim(){}
    fun fertilize(){}
}

//for printling names of all the methods inside plant we use ::class

fun testAnnotations(){

    val classObj = Plant::class
    for(m in classObj.declaredMemberFunctions){
        println(m.name)
    }
}

//testing annotations
annotation class IamPlant

@IamPlant class Plant1(){
    fun fertilize(){}
    fun trim(){}
}

fun testAnnotations1(){
    val classObj1 = Plant1::class
    for(a in classObj1.annotations){
        println(a.annotationClass.simpleName)
    }
}

//Labeled breaks -- Labels have the form of an identifier followed by the @ sign

fun labels(){
    outerLoop@ for (i in 1..100){
        print("$i ")
        for(j in 1..100){
            if(i>10)
                break@outerLoop //breaks to outer loop
        }
    }

}


fun main(){
//    testAnnotations()
//    testAnnotations1()
    labels()
}