fun main(args: Array<String>){
    var count = hashMapOf(Pair(1,"one"),Pair(2,"two"),Pair(3,"three"))

    println(count)

    count.put(4,"four")
    println(count)

    var more_count = hashMapOf(Pair(5,"five"),Pair(6,"six"))
    count.putAll(more_count)

    println(count)

    println(count.get(5))
    println(count.replace(2,"two-two"))
     println(count)

    println(count.remove(6))
}