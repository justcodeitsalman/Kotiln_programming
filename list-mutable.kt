fun main (args: Array<String>){
    var colors = arrayListOf("Red", "yellow", "green")

    println (colors)

    var emp_color= arrayListOf<String>()
    println(emp_color)

    colors.add("neon")

    var more_color = arrayListOf("balck", "white")

     colors.addAll(more_color)

    println(colors)

    colors.remove("neon")

    println(colors)

    colors.removeAll(more_color)

    println(colors)


}