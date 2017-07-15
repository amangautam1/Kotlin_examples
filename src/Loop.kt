/**
 * Created by Aman gautam on 12-Jul-17.
 */
fun main(args :Array<String>) {

    var items = listOf<String>("Aman", "Ankit", "kuchiya")
    for (item in items) {
        print(item+" ")
    }
    for(index in items.indices)
    {
        print(items[index]+" ")
    }
    var i=0
    while(i<items.size)
    {
        println("item at $i is ${items[i]}")
    /// print{items[i]}-
        i++
    }
}