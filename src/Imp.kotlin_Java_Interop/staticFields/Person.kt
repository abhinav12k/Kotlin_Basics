package kotlin_Java_Interop.staticFields

class Person(
    val name:String,
    val age:Int,
    val gender:String
){
    override fun toString(): String {
        return "Person(name='$name', age=$age, gender='$gender')"
    }

    companion object{
        @JvmField
        val STANDARD_MALE:Person = Person("John Doe",18,"male")

        @JvmField
        val STANDARD_FEMALE:Person = Person("Jane Doe",18,"female")

    }
}