package includeHelp

fun main(args: Array<String>) {
    var arr = arrayOf(5, 3, 4, 5)

    println("Using ArrayOf() ")
    for (a in arr)
        print(" $a")

    var arr1 = arrayOfNulls<Int>(5)
    println("\nUsing ArrayOfNuls() ")
    for (a in arr1)
        print(" $a")

    var arr2 = intArrayOf(5, 3, 4, 5)
    println("\nUsing intArrayOf() ")
    for (a in arr2)
        print(" $a")

    var arr3 = doubleArrayOf(5.3, 3.2, 4.3, 5.4)
    println("\nUsing doubleArrayOf() ")
    for (a in arr3)
        print(" $a")

    var arr4 = Array<Int>(5, { 0 })
    println("\n Using Array() initialize with 0 ")
    for (a in arr4)
        print(" $a")


    var arr5 = Array<Int>(5, { it * it })
    println("\nUsing Array() with index square")
    for (a in arr5)
        print(" $a")

    var arr6 = IntArray(5, { it * it })
    println("\nUsing IntArray() with index square ")
    for (a in arr6)
        print(" $a")

}