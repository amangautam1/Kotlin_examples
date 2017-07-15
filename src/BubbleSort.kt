import java.util.*

/**
 * Created by Aman gautam on 13-Jul-17.
 */
fun sort(arr:IntArray){
    var temp: Int
    for (i in 0..arr.size-1)
        for(j in i+1..arr.size-1)
        {
            if(arr[j]<arr[i])
            {
                temp=arr[i]
                arr[i]=arr[j]
                arr[j]=temp
            }
        }
}
fun main(args:Array<String>){
    println("enter bal :")
    var arr = intArrayOf(1,2,3,4,5)
    for(i in 0..4)
    {
        arr[i]= readLine()!!.toInt()
    }
    sort(arr)
    println("output....\n")
    for(i in arr.indices) print(" ${arr[i]} ,")



}