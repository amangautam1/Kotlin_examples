package includeHelp

open class vehicle {
    var price: Int = 0

    constructor(price: Int) {
        this.price = price
    }

}

class car : vehicle {
    var name: String = ""

    constructor(name: String, price: Int) : super(price) {
        this.name = name
    }
}

open class vehicle1 {
    open fun display() {
        print("Class vehicle")
    }

}

class car1 : vehicle1() {
    override fun display() {
        print("Class car")
    }

}


fun main(arr: Array<String>) {
    var ob = car("HYUNDAI", 500000);
    var o2 = car1()
    o2.display()
    println("Name : ${ob.name}")
    println("price : ${ob.price}")
}


