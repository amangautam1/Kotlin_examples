/**
 * Created by Aman gautam on 12-Jul-17.
 */
fun Max(a:Int,b:Int): Int{
    if(a>b)
        return a
    else
        return b
}
fun Max2(a:Int,b:Int)=if(a>b) a else b

fun main(args : Array<String>){
    var a=35
    var b=44
    print(" max of $a and $b = ${Max2(a,b)}")
}