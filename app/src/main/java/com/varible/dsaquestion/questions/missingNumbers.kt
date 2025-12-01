package com.varible.dsaquestion.questions

fun main(){
    val array = arrayOf(3,0,2)
    val n = 3
    print("find missing number:- ${finMissingNumber(array,n)}")
    println("find missing number Maths:- ${missingNumber(array)}")
    println("find missing using mao:- ${findUsingMap(array)}")
}

fun finMissingNumber(arr:Array<Int>,n:Int):Int{
    arr.sort()
    for(i in arr.indices){
        if(arr[i] != i) return i
    }
    return 0
}

fun missingNumber(arr: Array<Int>):Int{
    val n = arr.size
    val expectedSum = n * (n + 1) /2
    val actualSum = arr.sum()
    return expectedSum - actualSum

}

fun findUsingMap(arr: Array<Int>): ArrayList<Int>{
    val map = arr.toHashSet()
    var newList = ArrayList<Int>()
    for(i in 1..arr.size){
        if(!map.contains(i)) newList.add(i)
    }
    return newList
}

