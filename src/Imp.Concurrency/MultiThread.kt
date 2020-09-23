package Concurrency

fun main() {

    Thread{ printListDemo("1")}.start()
    Thread{ printListDemo("2")}.start()
    Thread{ printListDemo("3")}.start()
    Thread{ printListDemo("4")}.start()
    Thread{ printListDemo("5")}.start()
    Thread{ printListDemo("6")}.start()
    Thread{ printListDemo("7")}.start()
    Thread{ printListDemo("8")}.start()
    Thread{ printListDemo("9")}.start()
    Thread{ printListDemo("10")}.start()
    Thread{ printListDemo("11")}.start()
    Thread{ printListDemo("12")}.start()

}

fun printListDemo(id: String) {
    for (i in 0..10000) {
        if (i % 1000 == 0)
            println("LoopId: $id, iteration $i, thread ${Thread.currentThread().name}")
    }
}