package com.example.passwordstrengthchecker

fun main(){
    println("Enter you password:")
    val passWord = readLine()?: ""

    val hasLength = passWord.length>8
    val hasDigit = passWord.any{it.isDigit()}
    println("\n Password strength checker")
    println("Minimum 8 characters: $hasLength")
    println("Contains atleast 1 digit :$hasDigit")

    if(hasDigit&& hasLength){
        println("Password is strong")
    }else{
        println("Weak password")
    }
}