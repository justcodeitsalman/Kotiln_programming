fun main(args: Array<String>){

    var numbers = setOf(10,20,30,40)
    println(numbers)

    var emp_Numbers = setOf<Int>()
    println(emp_Numbers)

    var add_item = listOf(50,60,80)
    println(numbers)

    println(numbers.size)

    var count = hashSetOf(1,2,3,3,4,4,5,6)
    println(count)
    count.add(40)
    println(count)

    count.addAll(add_item)

    println(count)

    count.remove(3)
    println(count)

    count.removeAll(add_item)
    println(count)
}