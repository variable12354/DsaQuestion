package com.varible.dsaquestion.questions

fun main(){
//    var number = readLine()
//    print("Power Of Two ${powTwo(number?.toIntOrNull() ?: 0)}")
    val array = arrayOf(2,7,11,15)
    val target = 9
    println("find two sum:- ${findTowSum(array,target).toList()}")
}
//
//fun powTwo(number:Int):Boolean{
//    if(number <= 0) return false
//
//    var n = number
//    while(n % 2 == 0){
//        n /= 2
//    }
//    return n == 1
//}

fun findTowSum(num:Array<Int>,target:Int): Array<Int>{
    var map = HashMap<Int,Int>()
    for(i in num){
        val diff = target - i
        if(map.containsKey(diff)){
            return arrayOf(map[diff]!!,i)
        }
        map[i] = i
    }
    return arrayOf()
}