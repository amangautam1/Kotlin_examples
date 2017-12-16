package Basic

fun add(a: Int, b: Int): Int {
    return a + b;
}

fun substract(a: Int, b: Int) = a - b

fun defAdd(a: Int = 10, b: Int): Int {
    return a + b;
}

fun name(name: String) {
    print(name)
}

fun main(arg: Array<String>) {
    var result = add(10, 20)
    println(result)
    result = sub(20, 10)
    println(result)
    result = defAdd(b = 10)
    println(result)
    name("Aman")
}