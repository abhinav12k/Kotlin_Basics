package Concurrency

import kotlinx.coroutines.delay
import kotlinx.coroutines.launch
import kotlinx.coroutines.runBlocking

fun main(){
    println("Starting time: ${System.currentTimeMillis()}")
    runBlocking {
        launch {task1()}
        launch {task2()}
    }
    println("Starting time: ${System.currentTimeMillis()}")
}

/**
 * Using Delay doesn't block the main thread while making the thread sleep can
 * **/

private suspend fun task1(){
    println("Starting task1 on ${Thread.currentThread().name}")
    delay(500)
    println("Ending task1 on ${Thread.currentThread().name}")
}

private suspend fun task2(){
    println("Starting task2 on ${Thread.currentThread().name}")
    delay(500)
    println("Ending task2 on ${Thread.currentThread().name}")
}