import kotlin.random.Random

fun main(args: Array<String>){
    println("please provide your input")

    var UserInput = readln()

    println("Your input is: $UserInput")

    println("Enter your birth date year")
    var BirthYear= readln()?:"year can't be empty"
    println("Your ${2025-BirthYear.toInt()} year old ")


    println("integer random code is ${Random.nextInt(1000,1999)}")


}