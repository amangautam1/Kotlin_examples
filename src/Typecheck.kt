/**
 * Created by Aman gautam on 12-Jul-17.
 */
 fun getStrLength(str: Any):Int?{
    if(str is String) {
        return str.length
    }
    return null
}
fun getLength(str :Any )=if(str is String) str.length else null
fun main(args : Array<String>){
    println("length of  amanamaanamanamama = ${getStrLength("amanamaanamanamama")} ")
    println("length of  aanamanamama = ${getLength("aanamanamama")} ")
    print("length of  121221 = ${getStrLength(12111)} ")
}