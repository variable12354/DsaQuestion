package com.varible.dsaquestion.questions

fun main(){
    val array = arrayListOf(10,0,30,0,50,60,0)
//    moveAllZeroAtEnd(array)
//    usingOtherWay(array)
    twoPointerApproach(array)
    liearSearch(array)
}

fun moveAllZeroAtEnd(array: ArrayList<Int>){
    var count = 0
    var arrayList = arrayListOf<Int>()
    for(i in array.indices){
        if(array[i] > 0){
            arrayList.add(array[i])
        }else{
            count++
        }
    }
    print("Count:- $count")

    for(i in 0 until count){
        arrayList.add(0)
    }

    println("New ArrayList:- ${arrayList}")
}

fun usingOtherWay(array: ArrayList<Int>) {
    var tempArray = arrayListOf<Int>()
    for(i in array){
        if(i != 0) tempArray.add(i)
    }

    for(i in tempArray.indices){
        array[i] = tempArray[i]
    }

    for(i in tempArray.size until array.size){
        array[i] = 0
    }

    println("New ArrayList:- ${array}")
}

// Best way to sorted array and reverse to shift all zero number at the last positions
//using two pointer approach

fun twoPointerApproach(array: ArrayList<Int>){
    var index = 0
    for(i in array.indices){
        if(array[i] != 0){
            array[index] = array[i]
            index++
        }
    }

    while (index < array.size){
        array[index] = 0
        index++
    }
    println("New ArrayList Two Pointer approach:- ${array}")

}

fun liearSearch(array: ArrayList<Int>){
    val target = 60
    var findIndex = -1
    for(i in array.indices){
        if(array[i] == target)
            findIndex = i
    }

    println("updated:- $findIndex")
}