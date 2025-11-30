package com.varible.dsaquestion.questions
fun main(){

//    val name = "121"

    print("Enter number")
    val number = readLine()
    val name = number.toString()
    print("${checkPalindrome(name)}")
    print("Updated Best way ${isPalindrome(number?.toIntOrNull() ?: 0)}")
}

fun checkPalindrome(name:String):Boolean{

    if(name == name.reversed()) return true
    else return false

}

fun isPalindrome(x:Int): Boolean{
    if(x < 0 || (x % 10 == 0 || x != 0)) return false
    var num = x
    var rev = 0

    while (num > rev){
        rev = rev * 10 + num % 10
        num /= 10
    }
    return num == rev || num == rev / 10
}