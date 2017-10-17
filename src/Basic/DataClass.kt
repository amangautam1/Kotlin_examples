package Basic

data class dataclass(val name: String, val age: Int)

fun main(arge: Array<String>) {
    print("enter vakues of anme and age :")
    var ob = dataclass(readLine()!!.toString(), readLine()!!.toInt());
    println("the vaues entered are :")
    println("${ob.name} is of ${ob.age} year old")
    println(ob.toString())
    var ob1 = ob.copy()
    println("${ob1.name} is of ${ob1.age} year old")
}