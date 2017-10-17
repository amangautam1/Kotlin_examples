package Basic

/**
 * Created by Aman gautam on 12-Jul-17.
 */

fun sum(a :Int, b:Int): Int{
    return a+b
}
fun add(vararg num:Int) = num.sum()

fun sub(a:Int, b:Int) =a-b

fun main(args : Array<String>){
    println("Basic.sum of digits is : ${sum(3, 5)}")
    println(sub(a = 3, b = 5))
    println(sub(b = 3, a = 5))
    println(add(1, 2, 3, 4))
    println(add(21, 32, 12))
}
