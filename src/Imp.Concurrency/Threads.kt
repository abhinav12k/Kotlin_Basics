package Concurrency

import java.util.concurrent.CopyOnWriteArrayList

val numList = CopyOnWriteArrayList<Int>()

fun main() {

    for (i in 0..10000) {
        numList.add(i)
    }

    //Running on different Threads
//    Thread(Runnable {
//        printList("1")
//    }).start()
//    Thread { printList("2") }.start()
//    Thread { printList("3") }.start()

    /****Concurrent Modification Problem - On single Thread****/
    //This problem arises because the size of arrayList changes as we remove the elements from the list so to solve this
    //issue we can use iterators
//    dropMultiples(5)
//    dropMultiples(3)
//    dropMultiples(7)
//    dropMultiplesIterators(5)
//    dropMultiplesIterators(3)
//    dropMultiplesIterators(7)

    /****Concurrent Modification Problem - On Multiple Thread****/
    // Using same iterator causes the sam concurrency problem therefore to remove that we can use CopyOnWriteArrayList<Int>

    val itr = numList.iterator()
    Thread { dropMultiplesMultipleThreads(3, itr) }.start()
    Thread { dropMultiplesMultipleThreads(5, itr) }.start()
    Thread { dropMultiplesMultipleThreads(7, itr) }.start()

    numList.forEach { println(it) }
}

fun printList(id: String) {
    for (i in 0..10000) {

        if (id == "2" && i == 500) {
            Thread.sleep(100)
        }

        println("SuppliedId: $id, ${Thread.currentThread().id} " + i)
    }
}

fun dropMultiples(n: Int) {
    for (i in numList) {
        if (i % n == 0) {
            numList.remove(i)
        }
    }
}

fun dropMultiplesIterators(n: Int) {
    val itr = numList.iterator()
    while (itr.hasNext()) {
        val i = itr.next()
        if (i % n == 0) {
            itr.remove()
        }
    }
}

fun dropMultiplesMultipleThreads(n: Int, itr: MutableIterator<Int>) {
    while (itr.hasNext()) {
        val i = itr.next()
        if (i % n == 0) {
            itr.remove()
        }
    }
}