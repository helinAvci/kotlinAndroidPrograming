package com.helinavci.kotlinacademy
import java.lang.Exception
import java.util.*

fun main(){
    val input = Scanner(System.`in`)
    println("lütfen yaşınızı giriniz.")
    val age = input.next()
    try{
        if(age.toInt() > 0) {
            if (age.toInt() >= 18) {
                println("oy kullanabilirisiniz.")
            } else {
                println("oy kullanamazsınız.")
            }
        }else{
            println("geçerli bir yaş girmediniz.")
        }
    }catch(e : Exception){
        println("geçerli bir yaş girmediniz")
    }
}
