/**
 * Created by Aman gautam on 25-Nov-17.
 */
fun main(args: Array<String>) {
    println("Basic Calculator using Kotlin!")
    println("Enter two values ")
    print("a = ")
    var a = readLine()!!.toDouble()
    print("b = ")
    var b = readLine()!!.toDouble()
    println("1. Addition \n2. Substraction \n3. Multiplication \n4. Divide")
    print("Enter Choice : ")
    var ch = readLine()!!.toInt()
    print("Result : ")
    when (ch) {
        1 -> print("a+b = ${a + b}")
        2 -> print("a-b = ${a - b}")
        3 -> print("a*b = ${a * b}")
        4 -> print("a/b = ${a / b}")
        else -> print("Wrong Choice")
    }
}