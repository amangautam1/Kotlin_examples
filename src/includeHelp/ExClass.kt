package includeHelp

class ExBoy {
    var name: String
    var age: Int = 0

    constructor(name: String) {
        this.name = name;
    }

    constructor(name: String, age: Int) {
        this.name = name
        this.age = age
    }
}

fun main(str: Array<String>) {
    var ob = ExBoy("Aman")

    println(ob.name)  //same as ob.getName() in java
    ob.age = 19          // same as ob.setAge(19) in java
    println(ob.age)

    var o2 = ExBoy("Deepak", 16)
    print("${o2.name},${ob.age}")

}
