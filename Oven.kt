fun main(args: Array<String>){
    var myref: Oven = getOven()
    myref.start()
    myref.stop()
    myref.heat()
}



interface Oven {
    var temp: Int

    fun start()
    fun stop()
    fun heat(){
        println("heat at temperature $temp")
    }
}

class Bosch: Oven {
    override var temp: Int =40
    override fun start(){
        println("start the oven")
    }
    override fun stop(){
        println("stop the oven")
    }

}


fun getOven(): Oven{
    return Bosch()
}
