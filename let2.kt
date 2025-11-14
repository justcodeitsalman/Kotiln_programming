fun main(args: Array<String>){
    var client= arrayListOf<String>()
    do{
        println("please enter a client name")
        val input = readln()
        input?.let { ref ->
            if (ref == ""){
                client.add(ref)
            }
            else{
                client.add(ref)
            }
        }
    }while (input != "stop")

    client.forEach {
        println("Hello $it ")
    }
}