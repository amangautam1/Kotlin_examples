package Basic

interface A {
    fun display() {
        println("this is interface A")
    }
}

interface B {
    fun display() {
        println("this is interface B")
    }
}

class C : A, B {
    override fun display() {
        super<A>.display()
        super< B>.display()

    }
}

fun main(args: Array<String>) {
    var ob = C()
    ob.display()
}