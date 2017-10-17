package DS

/**
 * Created by Aman gautam on 12-OCT-17.
 */

class Queue(var value: Int, var link: Queue? = null)  // data class

class QHelper {
    var start: Queue? = null
    var rear: Queue? = null

    init {
        start = null
        rear = null
    }

    fun insert(value: Int) {
        if (start == null && rear == null) {
            var ptr = Queue(value, null)
            start = ptr
            rear = ptr;
        } else {
            var ptr = Queue(value, null)
            rear?.link = ptr
            rear = ptr
        }
        display()

    }

    fun delete() {
        if (start == null) {
            println("Underflow")
        } else {
            start = start?.link
            display()
        }
    }

    fun display() {
        if (start == null) {
            println("Underflow")
            return
        }
        var ptr: Queue? = null
        ptr = start
        while (ptr!!.link != null) {
            print("${ptr.value} ->")
            ptr = ptr.link
        }
        println(ptr.value)
    }
}

fun main(arg: Array<String>) {
    var ob = QHelper()
    while (true) {
        println("Queue Menu : \n 1 : insert \n 2 : delete \n 3 : print \n")
        var ch = readLine()!!.toInt()
        when (ch) {
            1 -> {
                println("enter a value :")
                var value = readLine()!!.toInt()
                ob.insert(value)
            }
            2 -> ob.delete()
            3 -> ob.display()
        }
    }
}