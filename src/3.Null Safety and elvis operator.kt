//declaring a var
var name: String? = null

fun main(){

//    name = "abhinav"

    // Elvis opertor is ?: , if the name is null then default value will be set i.e 0

    val size: Int = name?.length ?: 0

    println(size)

}
