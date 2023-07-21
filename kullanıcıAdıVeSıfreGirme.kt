package com.helinavci.kotlinacademy
import java.util.Scanner
fun main(){
    println("Lütfen kullanıcı adı ve şifrenizi girin.")
      var input = Scanner(System.`in`)
      var user = input.nextLine()
      var password = input.nextInt()
    if(user.equals("helin avcı" , ignoreCase = true) && password == 1501){ // 1501 is vailed password
        println("hoş geldiniz")
    }else{
        println("kullanıcı adı veya şifre hatalı")
    }



}


