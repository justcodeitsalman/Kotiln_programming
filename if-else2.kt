fun main(args: Array<String>){
    var storePetCollection = listOf("cat","dog","rabbit")
    var hasCatStore= false

    if(storePetCollection.contains("cat")){
        if(hasCatStore){
            println("Buy cat and cat food")
        }else{
            println("only buy cat")
        }
    }else{
        println("pet store don't have cat and cat food")
    }

}