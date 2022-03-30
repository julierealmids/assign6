fun main(){
    var car=Car("bmw","suvs","Black",6)
    car.carry(10)
    car.identity("white","Subaru","legacy")
    car.calculateParkingFees(6)

    var bus=Bus("corgi","harry porter","Blue",60)
    bus.maxTripFare(250.00)
    bus.calculateParkingFees(5)


}
open class Car(var make:String,var model:String,var color:String,var capacity:Int){
    fun carry(people:Int){
        var j = people-capacity
        if (people <=capacity){
            println("carrying $people passengers")
        }
        else{
            println("Over capacity by $j people")
        }
    }
    fun identity(color:String,make:String,model: String){
        println("this is a $color $make $model")
    }
    open fun calculateParkingFees(hours:Int): Int {
        var multiplication=hours*20
        return multiplication
    }

}
class Bus(make:String,model:String,color:String,capacity:Int):Car(make,model,color, capacity){
    fun maxTripFare(fare:Double):Double{
        var capacity=200*fare
        println(capacity)
        return(capacity)
    }

    override fun calculateParkingFees(hours: Int): Int {
        var z=capacity*hours
        println(z)
        return z
    }

    }

