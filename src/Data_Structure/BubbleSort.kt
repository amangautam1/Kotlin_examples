package Data_Structure

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
    print("Enter size of array : ")
    var n= readLine()!!.toInt()
    var arr=IntArray(n)
    println("enter values in array :")
    for(i in 0..n-1)
    {
        arr[i]= readLine()!!.toInt()
    }
    sort(arr)
    println("output....\n")
    for(i in arr.indices) print(" ${arr[i]} ,")


}