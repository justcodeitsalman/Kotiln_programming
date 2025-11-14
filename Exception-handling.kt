import java.lang.IllegalArgumentException

fun main(args: Array<String>){
    val CatName = readln()

    try {
        println("Cat name is ${CatName.toInt()}")
    }
    catch (e:Exception){
        println("Please check you input , input can't be no.")
        e.printStackTrace()
    }
    finally {
        println("Please retry again even though you have exception")
    }
    throw IllegalArgumentException("Sorry I can't help you with this your dumb")
}