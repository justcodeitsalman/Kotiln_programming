fun main(args: Array<String>){
    /*
    var input = readLine()?:"false"

    if(input.toBoolean()){
        println("It night go to sleep")
    }else{
        println("its day please wake up")
    }

     */
    println("please enter clients funds")
    var clientFunds= readLine()?:"0"
    var funds = clientFunds.toInt()
    println("please enter price")
    var price= readLine()?:"0"
    var prc= price.toInt()
    println("please enter product count ")
    var product = readLine()?:"0"
    var prd= product.toInt()

    if(funds>prc){
        funds -= prc
        prd += 1
        // continue with you operation
        println("So now you has funds:$funds and product:$prd ")
    }else{
        println("you have insufficient funds to purchase a product")
    }
}