package Basic

interface twoWheeler {
    fun getDeatils() {       //method with code
        println("This is an interface providing a method getPrice() which returns price as per quantity ")
    }

    var price: Int                              // property
    fun getPrice(qt: Int): Int                 // abstract method
}

class bajaj : twoWheeler {
    override var price = 45000
    override fun getPrice(qt: Int): Int {
        return qt * price
    }
}

class hero : twoWheeler {
    override var price = 50000
    override fun getPrice(qt: Int): Int {
        return (qt * price + 4500)
    }
}

fun main(args: Array<String>) {
    var platina = bajaj()
    platina.getDeatils()
    println("Enter quantity for platina  : ")
    var qt = readLine()!!.toInt()
    print(" Your Price : ")
    println(platina.getPrice(qt))

    var passion = hero()
    println("Enter quantity for passion  : ")
    qt = readLine()!!.toInt()
    print(" Your Price : ")
    println(passion.getPrice(qt))
}
