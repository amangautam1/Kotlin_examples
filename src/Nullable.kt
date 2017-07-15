import kotlin.text.Typography.times

/**
 * Created by Aman gautam on 12-Jul-17.
 */
fun parseInt(str :String):Int ?{
    return str.toIntOrNull()
}
fun printRes(arg1 :String,arg2:String){
    var x=parseInt(arg1)
    var y=parseInt(arg2)
    if(x!=null&&y!=null){
        println(x * y)
        return
    }
    print("either $x or $y is null")
   //
}


fun main(args:Array<String>){
    printRes("4","1")
   // print("\n")
    printRes("a","2")

}