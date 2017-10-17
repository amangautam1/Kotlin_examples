package DS

/**
 * Created by Aman gautam on 11-OCT-17.
 */
class Node(var value: Int, var next: Node? = null) // data class

class List {     //helper class
    var start: Node? = null;

    init {
        start = null;
    }

    fun insertAtBeg(value: Int) {
        var ptr = Node(value, null)
        if (start == null) {
            start = ptr;
        } else {
            ptr.next = start
            start = ptr;

        }
    }

    fun insertAtEnd(value: Int) {
        var ptr = Node(value)
        if (start == null) {
            start = ptr
        } else {
            var ptr1: Node?
            ptr1 = start!!
            while (ptr1?.next != null) {
                ptr1 = ptr1.next
            }
            ptr1!!.next = ptr

        }
    }

    fun insertAtPos(value: Int, pos: Int) {
        var ptr = Node(value, null)
        if (start == null) {
            start = ptr
        } else {
            var ptr1: Node?
            ptr1 = start!!
            while (ptr1?.value != pos) {
                ptr1 = ptr1?.next
            }
            ptr.next = ptr1.next
            ptr1.next = ptr


        }
    }

    fun delete(value: Int) {

        if (start == null) {
            print("Empty!!!")
            return
        }
        if (start!!.value == value) {
            start = start!!.next
        } else {
            var ptr1: Node?
            var prev: Node? = start
            ptr1 = start!!
            while (ptr1?.value != value) {
                prev = ptr1
                ptr1 = ptr1?.next
            }
            prev?.next = ptr1.next

        }
    }

    fun traverde() {
        if (start == null) {
            println("Underflow")
            return
        }
        var ptr: Node? = null
        ptr = start
        while (ptr!!.next != null) {
            print("${ptr.value} ->")
            ptr = ptr.next
        }
        println(ptr.value)

    }
}

fun main(arr: Array<String>) {
    var ob = List();
    while (true) {
        println("\n Linked List menu \n1. Insert at Beg \n2. Insert after a value \n3. Insert at End \n 4. Delete any node\n4. Display ")
        var ch = readLine()!!.toInt()
        when (ch) {
            1 -> {
                print("Enter any value :")
                var value = readLine()!!.toInt()
                ob.insertAtBeg(value)
            }
            3 -> {
                print("Enter any value :")
                var value = readLine()!!.toInt()
                ob.insertAtEnd(value)
            }
            4 -> {
                print("Enter node to delete :")
                var value = readLine()!!.toInt()
                ob.delete(value)

            }
            5 -> ob.traverde()
            2 -> {
                print("Enter any value :")
                var value = readLine()!!.toInt()
                print("Enter pos :")
                var pos = readLine()!!.toInt()

                ob.insertAtPos(value, pos)
            }

        }
    }
}