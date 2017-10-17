package Basic

/**
 * Created by Aman gautam on 13-Jul-17.
 */
fun main(args : Array<String>){
    for(i in 1..5)
        print(i)
    println()
    for (x in 1..10 step 2) {
        print(x)
    }
    println()
    for (x in 9 downTo 0 step 3) {
        print(x)
    }

}