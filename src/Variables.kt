//variables in kotlin has to be assigned at the time of declaration only
//if some one wants to declare at later point of view then we can use 'lateinit' function (only available for VARs not for VALs)

lateinit var company:String


fun main(){
    //In kotlin there is no need to specify variables type explicitly but they can be specified if wanted
    //Determining the variable type from value put at right hand side is called 'type inference'

    val a= 24
    val name = "abhinav"
    println(a)
    println("Hello, $name")

    //Two types of variable declarations
    //1. val (those which cannot be changed just like final in Java)
    //2. var (those whose value can be changed later)
    //*** var variables are usually shown with underline in IDE to easily differentiate between val and var

    var f = "games"
    println(f)
    f = "study"
    println(f)
    company = "No_company"
    println(company)
}