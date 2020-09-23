package Concurrency

fun main() {
    println("Starting time: ${System.currentTimeMillis()}")

//    task1()
//    task2()

    /**
     * For implementing a similar approach as the delay does we can do the following*/

    Thread { task1 { println("Ending time: ${System.currentTimeMillis()}") } }.start()
    Thread { task2 { println("Ending time: ${System.currentTimeMillis()}") } }.start()


}

private fun task1(onEnd: () -> Unit) {
    println("Starting task1 on ${Thread.currentThread().name}")
    Thread.sleep(500)
    println("Ending task1 on ${Thread.currentThread().name}")
    onEnd()
}

private fun task2(onEnd: () -> Unit) {
    println("Starting task2 on ${Thread.currentThread().name}")
    Thread.sleep(500)
    println("Ending task2 on ${Thread.currentThread().name}")
    onEnd()
}