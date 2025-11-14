fun main(args: Array<String>){
    var animal = listOf("dog","cat","hati", "sherni","horse","tiger","cheeta")
    animal.map { it.length }
      .filter { it > 3 }
        .let { ref ->
            println(ref)   // print list
            println(ref.size)   // size of list
        }


    var input= readln()
    input?.let { ref ->
        val res=ref.toInt()
        println(res *2)

    }

}