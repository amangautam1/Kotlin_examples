/**
 * Created by Aman gautam on 13-Jul-17.
 */
fun  main(args : Array<String>) {
    var num = arrayListOf(1, 2, 3, 4, 5, 6)
    val countries = listOf(Pair("India", "Delhi"), Pair("France", "Paris"), Pair("Germany", "Berlin"))
    val map=mapOf(1 to 1,2 to 4,3 to 9,4 to 16,5 to 25)
    val map2 = mapOf(Pair("UP","Lacknow"),Pair("MP","Bhopal"),Pair("Bihar","Patna"))
    println("\nEven no are : ${num.filter{i->i%2==0}}")
    for((c,s) in countries)
        println("country : $c  capital : $s")
    for((n) in map)
        println("number: $n square : ${map[n]}")
    for((s,c) in map2)
        println("States : $s capital : $c")
}