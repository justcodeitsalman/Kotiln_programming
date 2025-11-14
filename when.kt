fun main(args: Array<String>){

    var animal = readln()?:""
    var action:String = ""
    when(animal){
        "cat"->{
            action="pet it"
        }
        "dog"->{
            action= "feed it"
        }

        else->{
            action="google it"
        }
    }

    println("when you meet $animal you should $action")
}