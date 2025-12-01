package com.varible.dsaquestion.questions

fun main(){
    val arr = arrayOf(1,2,3,4,5,1,2,3)
    print("dupicate:- ${arr.distinct()}")
    println("duplicate Set:- ${arr.toSet()}")
    println("duplicateLogic:-${duplicateArray(arr).toList()}")

}

fun duplicateArray(arr:Array<Int>):Array<Int>{
    var seen = HashSet<Int>()
    var newList = ArrayList<Int>()
    for(i in arr){
        if(!seen.add(i)) newList.add(i)
    }
    return newList.toTypedArray()
}