fun  main(args: Array<String>){

    var count = mapOf(Pair(1,"one"),Pair(2,"two"),Pair(3,"three"))
    println(count)

    var emp_count= mapOf<Int,String>()
    println(emp_count)

    println(count.get(2))
    println(count.keys)
    println(count.values)
}