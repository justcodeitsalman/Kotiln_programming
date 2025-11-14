fun main(args: Array<String>){
    var cats=5
    println(cats::class.java) // implicit type is integer

    var catsbyte:Byte =5
    println(catsbyte::class.java) // Explicit type is byte

    // data type conversion

    var CustomerNo = 10
    println(CustomerNo::class.java)

    var CustomerNotolong = CustomerNo.toLong()
    println(CustomerNotolong::class.java)

    var price= 10.22
    println(price::class.java)

    var pricetoFloat = 10.22F
    println(pricetoFloat::class.java)

    var peopleNo =75L
    println(peopleNo::class.java)


    var MyPetCount=10
    println(MyPetCount::class.java)

    var MyPetCountToString = MyPetCount.toString()

    println(MyPetCountToString::class.java)



}