
/**
 * Created by Aman gautam on 13-Jul-17.
 */
infix fun String.hello(name:String)="Hello, $name. $this"
fun main(arg: Array<String>){
print("Test".hello("test"))
}