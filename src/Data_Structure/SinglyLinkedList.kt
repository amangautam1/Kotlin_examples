package Data_Structure

import kotlin.system.exitProcess

data class SinglyLinkedList(var value: Int, var link: SinglyLinkedList? = null)

class TestList {
    var start: SinglyLinkedList? = null

    init {

    }

    fun insert(value: Int) {
        var ptr = SinglyLinkedList(value, null)
        if (start == null) {
            start = ptr
        } else {
            ptr.link = start
            start = ptr
        }
    }

    fun delete() {
        if (start == null) {
            print("underFlow!!")
            exitProcess(0)
        } else {
            start = start?.link
        }
    }

    fun traverse() {
        if (start?.link == null) {
            print("underFlow!!")
            return
        }

        var ptr1 = start
        while (ptr1?.link != null) {
            print("${ptr1.value}")
            ptr1 = ptr1.link
        }
        print(ptr1?.value)
    }
}

fun main(str: Array<String>) {
    while (true) {
        println(" Linked List Menu ")
        println(" 1. Insert at begining")
        println(" 2. Delete")
        println(" 3. Traverse")
        println(" 4. Exit")
        var ob = TestList()
        var ch = readLine()!!.toInt()
        when (ch) {
            1 -> {
                print("Enter element : ")
                var element = readLine()!!.toInt()
                ob.insert(element)
            }
            2 -> {
                ob.delete()
                print("Deleted")
            }
            3 -> {
                ob.traverse()
            }
        }
    }
}