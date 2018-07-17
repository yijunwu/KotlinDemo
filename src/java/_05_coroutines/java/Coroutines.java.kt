package _05_coroutines.java

import kotlinx.coroutines.experimental.async
import kotlinx.coroutines.experimental.delay
import kotlinx.coroutines.experimental.launch
import kotlinx.coroutines.experimental.runBlocking
import java.lang.Thread.sleep
import kotlin.concurrent.thread

fun main(args: Array<String>) = coroutines(1_000_000)


fun threads(n: Int) {
    val threads = List(n) {
        thread {
            println(it)
            sleep(10000L)
        }
    }
    threads.forEach { it.join() }
}







fun coroutines(n: Int) = runBlocking {
    val jobs = List(n) {
        launch {
            println(it)
            delay(10000L)
        }
    }
    jobs.forEach { it.join() }
}
