package Basic

abstract class School(var name: String, std: Int) {
    var school = "ABC School"
    fun name(): String {
        return name;
    }

    abstract fun showprofile()
}

class Student(name: String, var std: Int) : School(name, std) {
    override fun showprofile() {
        println(" School : $school\n Name : $name, Class : $std")
    }
}

fun main(Args: Array<String>) {
    var obj = Student("Krishna", 4)
    println(" Calling Abstract method")
    obj.showprofile()
    println("\n calling non abstract method")
    println(" Name : ${obj.name()}")
}