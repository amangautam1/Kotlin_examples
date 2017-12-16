package Basic

fun main(args: Array<String>) {

    var a = 5;
    var b = 10
    var max = if (a > b) {
        println("a is max")
        a
    } else {
        println("b is max")
        b
    }
    print("value= $max")
}