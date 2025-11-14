fun main(args: Array<String>){
    val ref = listOf("a","b","c")
    println(ref.test())

}

fun <T>List<T>.test(): T? {
    return if (this.size > 3) this[1] else null
}