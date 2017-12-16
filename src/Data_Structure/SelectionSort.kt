package Data_Structure

fun selection_sort(A: Array<Int>) {
    var n = A.size
    var temp: Int
    for (i in n - 1 downTo 0) {
        var max = i
        for (j in 0 until i) {
            if (A[j] > A[max])
                max = j
        }
        if (i != max) {
            temp = A[i]
            A[i] = A[max]
            A[max] = temp
        }
    }
}

fun main(arg: Array<String>) {
    print("Enter no. of elements :")
    var n = readLine()!!.toInt()

    println("Enter elements : ")
    var A = Array(n, { 0 })
    for (i in 0 until n)
        A[i] = readLine()!!.toInt()

    selection_sort(A)

    println("Sorted array is : ")
    for (i in 0 until n)
        print("${A[i]}  ")
}