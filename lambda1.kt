fun main(args: Array<String>){
        val listOfNames= arrayListOf("salman","anjuman","test")
        val myLambda = {name:String -> println("hello $name")}
        sayHello(listOfNames,myLambda)
}

fun sayHello(names:ArrayList<String>,doSomething:(String) -> Unit){
       for ( name in names){
           doSomething(name)
       }
}