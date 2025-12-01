package com.varible.dsaquestion.questions

fun main(){
    val arr = arrayOf(8,1,1,2,3)
    print("Smaller Number:- ${smallerNumbersThanCurrent(arr).toList()}")  // using Brute Force 0(n2) space 0(1)
    println("Smaller Number using map:- ${smallerNumbersThanCurrentCompress(arr).toList()}") // using map 0(n log n) space 0(n)
}


// Using Brute Force
fun smallerNumbersThanCurrent(nums: Array<Int>): ArrayList<Int> {
    var result = ArrayList<Int>()
    for(i in nums.indices){
        var count = 0
        for(j in nums.indices){
            if(nums[i] > nums[j]) count++
        }
        result.add(count)
    }
    return result
}

fun smallerNumbersThanCurrentCompress(nums: Array<Int>): ArrayList<Int> {
    val n = nums.size
    val sorted = nums.copyOf()
    sorted.sort() // O(n log n)

    // map value -> first index (count of smaller numbers)
    val firstIndex = HashMap<Int, Int>()
    for (i in sorted.indices) {
        firstIndex.putIfAbsent(sorted[i], i)
    }

    val result = ArrayList<Int>()
    for (i in 0 until n) {
        result.add( firstIndex[nums[i]] ?: 0)
    }
    return result
}