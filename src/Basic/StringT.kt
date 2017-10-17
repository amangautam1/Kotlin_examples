package Basic

/**
 * Created by Aman gautam on 12-Jul-17.
 */
fun  main(args : Array<String>) {
    var a=1
    var str="a is $a"
    a=2
    var str2="${str.replace("is","was")}, but now is $a"
    print(str2)
    // var an=input("aman")
}