package Basic

import java.util.*

/**
 * Created by Aman gautam on 13-Jul-17.
 */
fun main(arg:Array<String>){
    val `in`= Scanner(System.`in`)
    print("enter no of rows .. > ")
    val n=`in`.nextInt()
    var k=1
    for(i in 0..n-1){
        for(j in 0..i){
            print(" $k ")
            k++
        }
        println()}

}