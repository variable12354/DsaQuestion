package com.varible.dsaquestion.questions

//Rotate Array by k position

fun main(){

    var array = arrayListOf(10,20,30,5,40,50)
    checkArraySorted(array)
    bruteForce(array)
    normalRotation(array)
    largestElement(array)
    secondLargest(array)
    leftRotateArrayByOne(array)
    reverseKUsingBruteForce(array)
}


fun normalRotation(array: ArrayList<Int>){
    var end = array.size - 1
    var top = 0
    while(top < end){
        var temp = array[top]
        array[top] = array[end]
        array[end] = temp
        top++
        end--
    }
    // time Complexity is 0(n/2) space complexity is 0(1)
    println("Reverse Array:- ${array}")
}

fun bruteForce(array: ArrayList<Int>){
    var newArrayList = ArrayList<Int>()
    for(i in array.size - 1 downTo  0){
        newArrayList.add(array[i])
    }
    println("reverse array brute force way :- ${newArrayList} ${newArrayList.size}")
}


//find largest element from the array
fun largestElement(array: ArrayList<Int>){
    var max = array[0]
    var smallest = array[0]
    for(i in array){
        if(i > max){
            max = i
        }else if(i < smallest){
            smallest = i
        }
    }
    println("Largest Element:- $max $smallest")
}

fun secondLargest(array: ArrayList<Int>){
    var largets = 0
    var secondLargest = 0

    for (num in array){
        if(num > largets){
            secondLargest = largets
            largets = num
        }else if(num > secondLargest && num != largets){
            secondLargest = num
        }
    }

    println("Second Largest:- ${secondLargest} ")

}

fun checkArraySorted(array: ArrayList<Int>){
    var isSorted = false
    for(num in 1 until array.size){
        if(array[num] < array[num - 1]){
            isSorted = false
        }
    }
    isSorted = true

    println("Given Array is sorted or not :- $isSorted")
}

fun leftRotateArrayByOne(array: ArrayList<Int>){
    val first = array[0]
    for(i in 0 until array.size - 1){
        array[i] = array[i+1]
    }
    array[array.size - 1] = first
    println("Left Rotate Array By One:- ${array}")
}

// reverse K element for BruteForce approach
fun reverseKUsingBruteForce(array: ArrayList<Int>){
    val d = 3
    var temp = array.take(d)
    var length = array.size
    for(i in length - d until length){
        array[i - d] = array[i]
    }

    for(i in length - d until length){
        array[i] = temp[i - (length-d)]
    }

    println("Shifted Array:- $array")

}


// now using best way using reverse array like taeke
// first a to a+d  reverse array
// second a+d to a+n reverse array
// then a to a+n reverse array

fun reverseKUsingReverseLogic(array: ArrayList<Int>){
    val d = 3
    val k =  d % array.size // in case d is grater then n


    revese(array,0,d-1)
    revese(array, i = d, j = array.size - 1)
    revese(array,0 , array.size - 1)

    println("reverse Array By K pos:- $array")

}

fun revese(array: ArrayList<Int>,i:Int,j:Int){
    var start = i
    var end = j
    while (start < end){
         val temp = array[start]
         array[start] = array[end]
         array[end] = temp
         start ++
         end --
    }

}
