package Concurrency

import kotlinx.coroutines.*

val numberList = ArrayList<Int>()

fun main() {

    for (i in 0..10000) {
        numberList.add(i)
    }

    //runBlocking ensures that the main program ends when the tasks in runBlocking block ends
    //In Android we can use GlobalScope also because the program doesn't finishes automatically after running main file

    //Main program can end even when GlobalScope.launch is not ended
//    GlobalScope.launch {
//
//        //Parallel running
//        printNumberList("1");
//        printNumberList("2");
//        printNumberList("3");
//
//    }

    runBlocking {
        //Parallel running
        launch { printNumberList("1") };
        launch { printNumberList("2")};
        launch { printNumberList("3")};
        launch { printNumberList("4")};
        launch { printNumberList("5")};
        launch { printNumberList("6")};
        launch { printNumberList("7")};
        launch { printNumberList("8")};
        launch { printNumberList("9")};
    }

    /**
     * Coroutines are better than Threads because Threads take time to destroy and recreate while coroutines use the
     * earlier created threads which are not currently used
     * **/

}

// To use coroutine we use suspend function
suspend fun printNumberList(id: String) {
    for (i in 0..10000) {
        if (i % 100 == 0) {
            withContext(Dispatchers.IO) {
                println("$id $i")
            }
        }
    }
}
