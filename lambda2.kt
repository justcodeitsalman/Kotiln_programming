fun main(args: Array<String>){
   var listNumber = arrayListOf(1,2,3,4,5,6,7,8,9,10)
   val myLambda = {number:Int -> println("${(number/10).toInt()}") }
    calculate(listNumber,myLambda)
}



fun calculate(number:ArrayList<Int>, doMultiply:(Int)-> Unit ){
    for ( i in number){
        if (i%2 == 0) doMultiply(i) else println("$i is not even no.")
    }
}
