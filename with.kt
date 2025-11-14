fun main(args: Array<String>){
    var store = store()

    with(store){
        shoes=20
        shirts=40
        jacket=100
        inventory()
    }

}


class store {
    var shoes = 10
    var shirts = 20
    var jacket = 30

    fun inventory(){
        println("In my Store Inventory I have $shoes shoes , $shirts shirts , $jacket jacket")
    }

}