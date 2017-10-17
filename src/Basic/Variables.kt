package Basic

/**
 * Created by Aman gautam on 12-Jul-17.
 */
fun  main(args : Array<String>){
    val a :Int =5
    val b =10.5
    val c :Float
    c=100.14f
    val n=1..100
    var s="aman"
    var t=" gautam "
    val d=a+b+c
    var nullable:String?=null

    println("a=$a \nb=$b \nc=$c \nd=$d")
    println(s+t)
    n.forEach{print(" $it")}

}