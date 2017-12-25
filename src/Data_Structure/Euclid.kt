package Data_Structure

fun gcd_1(a: Int, b: Int): Int {
    var a = a
    var b = b
    while (b != 0) {
        var t = b;
        b = a % b;
        a = t;
    }
    return a
}

fun gcd_2(a: Int, b: Int): Int {
    if (b == 0)
        return a
    else
        return gcd_2(b, a % b)
}

fun main(args: Array<String>) {
    println("Enter two number ")
    var a = readLine()!!.toInt()
    var b = readLine()!!.toInt()

    println("Using iterative function GCD = ${gcd_1(a, b)}")
    println("using recursive function GCD = ${gcd_2(a, b)}")
}