//By default Kotlin generates the default class name as the function name to change that
//we can use @file:JvmName("_specify_name_") Now this function can be assessed in java file
//by simply the name specified as JvmName
@file:JvmName("Greet")
package kotlin_Java_Interop.JvmName

import java.util.*

fun greeter(name: String): String {

    val cal = Calendar.getInstance()

    if (cal.get(Calendar.HOUR_OF_DAY) < 12) {
        return "Good Morning $name"
    }
    if (cal.get(Calendar.HOUR_OF_DAY) < 18) {
        return "Good Evening $name"
    }
    return "Good Night $name"
}