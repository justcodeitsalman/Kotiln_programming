interface Car{
    fun drive()
    fun speed()
    fun park()
}


class BMW():Car{
    override fun drive() {
        println("yes you can drive ")
    }

    override fun speed() {
        println("Speed of  car is ...")
    }

    override fun park() {
        println("yes car  ha parking facility")
    }

}


class carFactory: Car{
    override fun drive() {
        TODO("Not yet implemented")
    }

    override fun speed() {
        TODO("Not yet implemented")
    }

    override fun park() {
        TODO("Not yet implemented")
    }

}
