package Basic

/**
 * Created by Aman gautam on 18-Jul-17.
 */
fun main(arg: Array<String>) {
    var array = ArrayList<String>();
    array.add("aman")
    array.add("Atul")
    array.add("bharti")
    array.add("HERRO ALOM")
    println(array)
    array.set(3, "partha")
    println(array)
    for (i in array) {
        print("$i, ")
        /* if (i.contains("arti")) {
             println("found arti")
         }*/
    }

}