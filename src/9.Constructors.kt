fun main() {

    //Testing out primary constructor
//    val myCollege: College = College("BVCOE", "Paschim Vihar")
//    println("CollegeName: ${myCollege.CollegeName}, Location: ${myCollege.Location}")

    val collegeTier1: College = College("IIT Delhi")
    val collegeTier2: College = College("NIT", "Delhi", 4)
    println("CollegeName: ${collegeTier1.collegeName}, Location: ${collegeTier1.location}")
    println("CollegeName: ${collegeTier2.collegeName}, Location: ${collegeTier2.location}, No of Branches: ${collegeTier2.noOfBranches}")

    val bigPerson:Person = Person("Godfather")
    Person("son",bigPerson)
    val familyList:MutableList<Person> = bigPerson.getPersonInfo()
    familyList.forEach { it -> println(it.name) }
}
//using the constructor keyword in the header of class if the constructor's
// arguments contain any annotations but if any annotations is not present the
// constructor keyword can be removed from the header

//class College constructor(var CollegeName:String, var Location:String, var NIRF_Ranking:Int){
//class College(var CollegeName: String, var Location: String) { //Primary constructor
class College { //Removing primary constructor for using secondary constructor

    var noOfBranches: Int = 4
    var collegeName: String = "Default"
    var location: String = "N/A"

    //    Constructors
    /* A class in Kotlin can have a
    1.Primary constructor --ONLY 1
    2.Secondary constructors -- One/More than one
    The primary constructor is part of the class header: it goes after the class name (and optional type parameters).
    **If the primary constructor does not have any annotations or visibility modifiers, the constructor keyword can be omitted:
    */

    /*
    * .also invoked println with the string value, so the also function may
    * check for some condition or doing some computation before calling println
    */

//    -------- init blocks run  even before the secondary constructors ------------------

    val college = "First property: $collegeName".also(::println)

    init {
        println("First initializer block that prints ${collegeName}")
    }

    val secondProperty = "Second property: ${collegeName.length}".also(::println)

    init {
        println("Second initializer block that prints ${collegeName.length}")
    }

    //Using secondary constructor -> Basic example  (Not using primary constructor in this example)
    //Constructor Overloading ->  https://stackoverflow.com/questions/44176210/constructor-overloading-with-kotlin [Must See]
    //For using primary as well as secondary constructor in a single class the secondary constructor must
    // directly or indirectly call the primary constructor.
    constructor(collegeName: String) {
        this.collegeName = collegeName
    }

    constructor(collegeName: String, Location: String, noOfBranches: Int) {
        this.collegeName = collegeName
        this.location = Location
        this.noOfBranches = noOfBranches
    }

}
/*
* If the class has a primary constructor, each secondary constructor needs to delegate to the primary constructor,
* either directly or indirectly through another secondary constructor(s). Delegation to another constructor of the
* same class is done using the this keyword:
*/

class Person(val name:String){

    var children:MutableList<Person> = mutableListOf()
    // This constructor internally calls the primary constructor and creates a person with the name provided in the secondary
    // constructor, now this new person that is created by the name provided is added as a children of the other person that is
    // provided as another argument in the constructor
    constructor(name:String,parent:Person):this(name){
        parent.children.add(this)
    }

    fun getPersonInfo() :MutableList<Person>{
        return this.children
    }

}
