package Basic

/**
 * Created by Aman gautam on 13-Jul-17.
 */
open class Car(var fname:String, var sname:String){
    fun fullName()=fname+sname
}
class Ford(name1:String, name2:String) : Car(name1,name2)
fun main(agr:Array<String>) {
    val focus = Ford("Maruti ", " Suzuki ")
    print(focus.fullName())

}