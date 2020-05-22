fun isTooHot(temperature: Int) = temperature > 30
fun isDirty(dirty: Int) = dirty > 30
fun isSunday(day: String) = day=="Sunday"

fun shouldChangeWater(day: String, temperature: Int = 20 ,dirty: Int = 40): Boolean{
    return when{
        isTooHot(temperature) -> true
        isDirty(dirty) -> true
        isSunday(day) -> true
        else -> false
    }
}

fun main(args: Array<String>){
    print(shouldChangeWater("Monday"))
}

