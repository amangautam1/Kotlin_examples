package Basic

// here is programm for even and odd in just 2 lines only

fun main(args: Array<String>) {
    val list = listOf(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
    println("Even no are : ${list.filter { it % 2 == 0 }}  \nOdd are : ${list.filter { i -> i % 2 != 0 }}")


}