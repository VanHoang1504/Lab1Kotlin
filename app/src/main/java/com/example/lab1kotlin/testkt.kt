package com.example.lab1kotlin

fun main(){
    // khai báo và sử dụng biến
    val a = 1
    // a = 2
    val b = 2

    val c = (a + b)

    val d : String = "Tổng 2 số $a và $b : $c"
    println(d)
   val kq =phepchia(1,3f)
    println(kq)
}

fun phepchia(soA: Int, soB : Float) : String{
    if (soB == 0f){
        return "Số B phải khác 0!"
    }

    val c = soA / soB

    return "Thương 2 số $soA và $soB = $c"
}