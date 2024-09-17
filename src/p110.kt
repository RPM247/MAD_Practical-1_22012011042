class Car (val info : String, val owner : String, val miles : Int, val oPrice : Int, val cPrice : Int) {
    fun information() {
        println("*********************************")
        println("Car information : $info")
        println("Car owner : $owner")
        println("Miles Drive : $miles")
        println("Original Car Price : $oPrice")
        println("Current Car Price : $cPrice")
        println("*********************************")
        println()
    }
}
fun main(){
    val c1 = Car("BMW, 2015", "Rudra", 125, 100000, 98950)
    val c2 = Car("BMW, 2019","Dharmendra", 80, 400000, 379800)
    val c3 = Car("Toyota", "Harsh", 1050, 10880000, 579000)
    val c4 = Car("Maruti", "Kirtan", 200, 400000, 399800)
    c1.information()
    c2.information()
    c3.information()
    c4.information()
}

