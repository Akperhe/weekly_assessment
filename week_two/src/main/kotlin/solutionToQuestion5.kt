/*
Question 5 -> Assign values to the instance variables in these classes
and then print out the values in the main function by
accessing the values. NB: Use getters and setters.
 */
fun main() {
    // the below create an instances of the classes and uses function "setter" to assign value to class

    var phone: Phone = Phone("Infinix","70by70") //
    // var phone: Phone = Phone("Xiaomi")  the class Phone has two constructor with different numbers of argument

    phone.setRam(12)
    phone.setColor("Crazie Blue")
    phone.setStorage(520)

    var car : Car= Car("SmithVision")

    car.setYear(2025)
    car.setModel("Telsa")
    car.setMaxSpeed(450)
    car.setColor("red")

    var engine : Engine =Engine("Marine Application")

    engine.setWeightTon(4.5)
    engine.setTorque(456.6)
    engine.setSpeedRpm(600.0)
    engine.setPowerMw(12200.00)

    var animal : Animal = Animal("Cat")

    animal.setColor("Black")
    animal.setIsDomestic(true)
    animal.setNoOfLegs(4)
    animal.setClasss("Mammal")

    var drone :Drone = Drone(true)

    drone.setSpeed(788.66)
    drone.setElevation(70.0)
    drone.setLong(70.90)
    drone.setLat(60.66)

    //the below uses the getter function to get values/properties of instance variables values and print out to the console
    println("${phone.getBrand()}\n${phone.getStorage()}\n${phone.getColor()}\n${phone.getRam()}\n${phone.getSize()}")
    println()
    println("${car.getBrand()}\n${car.getColor()}\n${car.getMaxSpeed()}\n${car.getModel()}\n${car.getYear()}")
    println()
    println("${engine.getApplication()}\n${engine.getPowerMw()}\n${engine.getSpeedRpm()}\n${engine.getTorque()}\n${engine.getWeightTon()}")
    println()
    println("${animal.getName()}\n${animal.getClasss()}\n${animal.getNoOfLegs()}\n${animal.getIsDomestic()}\n${animal.getColor()}")
    println()
    println("${drone.getLat()}\n${drone.getLong()}\n${drone.getElevation()}\n${drone.getSpeed()}\n${drone.getIsAutoMode()}")
}