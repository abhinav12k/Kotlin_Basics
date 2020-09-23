package kotlin_Java_Interop.keywords

 fun main(){

     val person:Person = Person()

     //When we have used some special keywords of kotlin in our java code then to use them in the
     //Kotlin code we need to place them in `_keyword_` to make them operate well

     //Widely used special keywords of kotlin are -> when, in, object

     person.`when`("angry").shout("What the hell!!")
     person.`when`("sad").shout("What i have done :(")
     person.`when`("happy").say("Welcome to the cool days")

     person.setMood("happy")
     person.setMood("sad")
 }