package Concurrency

import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking
import kotlinx.coroutines.withContext

fun main() {

    runBlocking {
        launch { printListSuspend("1") }
        launch { printListSuspend("2") }
        launch { printListSuspend("3") }
        launch { printListSuspend("4") }
        launch { printListSuspend("5") }
        launch { printListSuspend("6") }
        launch { printListSuspend("7") }
        launch { printListSuspend("8") }
        launch { printListSuspend("9") }

    }

}

suspend fun printListSuspend(id: String) {
    for (i in 0..10000) {
        if (i % 1000 == 0) {
            //If we run the below code without using the withContext then the code will run on MainThread only
            //but if we use withContext then they will run on different threads
            withContext(Dispatchers.IO) {
                println("LoopId: $id, iteration $i, thread ${Thread.currentThread().name}")
            }
        }
    }
}