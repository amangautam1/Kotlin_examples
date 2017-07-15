/**
 * Created by Aman gautam on 14-Jul-17.
 */
interface Animal{
    val MAX_AGE:Int
    fun makeSound():String
    fun doMove():String
}
class Dog : Animal {
    override val MAX_AGE = 10
    override fun makeSound() = "Slothers"
    override  fun doMove()="Hisses"
}
fun main(Args:Array<String>){
    val ob=Dog()
    print(" Sname sounf : ${ob.makeSound()}")
    print(" Sname move : ${ob.doMove()}")
    print(" Sname Age : ${ob.MAX_AGE}")
}