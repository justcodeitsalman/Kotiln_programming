
fun main(args: Array<String>){

    var ref:Dog = Pug()
    ref.play()
    ref.bark()
    ref.run()
}



abstract class Dog{
    abstract fun play()
    abstract fun bark()
    abstract fun run()

}

class Pug:Dog(){
    override fun run(){
         println("Pug can Run")
     }
    override fun play(){
        println("pug can play")
    }

    override fun bark() {
        println("pug cannot bark")
    }
}

class basset_Hound:Dog(){
    override fun run(){
        println("Basset can't Run")
    }
    override fun play(){
        println("Basset can play")
    }

    override fun bark() {
        println("Basset can bark")
    }

}

class old_Chihuahua:Dog(){
    override fun run(){
        println("old_Chihuahua can't Run")
    }
    override fun play(){
        println("old_Chihuahua can't play")
    }

    override fun bark() {
        println("old_Chihuahua can bark")
    }


}