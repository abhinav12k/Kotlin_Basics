
//const val vs val -->
/*The value for const val is determined at compile time, where as the value for
val is determined during program execution, which means, val can be assigned by
a function at run time. val can be assigned a value from a function, but const val cannot.
*/


//val value1 = complexFunctionCall() // OK
//const val CONSTANT1 = complexFunctionCall() // NOT ok


//const val only works at the top level, and in singleton classes declared with object,
// not with regular classes.
//You can use this to create a file or singleton object that
//contains only constants, and import them as needed.

object Constants {
    const val CONSTANT2 = "object constant"
}
val foo = Constants.CONSTANT2

/*
To define constants inside a class, you have to wrap them into companion objects declared with the
companion keyword. The companion object is basically a singleton object within the class.
 */

/*
* The basic difference between companion objects and regular objects is:
    Companion objects are initialized from the static constructor of the containing class, that is, they are created when the object is created.
    Regular objects are initialized lazily on the first access to that object; that is, when they are first used.
*/

class MyClass {
    companion object {
        const val CONSTANT3 = "constant in companion"
    }
}