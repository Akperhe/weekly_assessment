/*
Assign values to the instance variables in these classes
and then print out the values in the main function by
accessing the values. NB: Use getters and setters.
 */

fun main() {
    /* all setter have been done inside the classes as instructed and
    all getter are used here with string template
    NB: getter and setter are default and auto generated in classes
    */
    // the below create an instances of the classes and uses default method/function "setter" to assign value to class with public identifiers
    var phone: Phone = Phone()
    phone.size="55x23x12"
    phone.ram="12gb"
    phone.color="Crazie Blue"
    phone.storage="520gb"
    phone.setBrand("Xiaomi")
    //phone.brand="Xiaomi"

    var car : Car= Car()
    car.year=2025
    car.model="Telsa"
    car.maxSpeed= 450
    car.setBrand("SmithVision")
    //car.brand="SmithVision"
    car.color="red"

    var engine : Engine =Engine()
    engine.weightTon=4.5
    engine.torque=456.6
    engine.speedRpm=600.0
    engine.powerMw=12200.00
    //engine.application="Marine Propulsion"
    engine.setApplication("Marine Propulsion")

    var animal : Animal = Animal()
    animal.color="Black"
    animal.isDomestic= true
    animal.noOfLeg=4
    animal.classs ="Mammal"
    //animal.name="Cat"
    animal.setName("Cat")

    var drone :Drone = Drone()
    drone.speed=788.66
    //drone.isAutoMode = true
    drone.setIsAutoMode(true)
    drone.elevation =70.0
    drone.long=70.90
    drone.lat=60.66

    //the below uses the primitive getter that is a default method to get instance variables values of its class properties
    println("${phone.getBrand()}\n${phone.storage}\n${phone.color}\n${phone.ram}\n${phone.size}")
    println()
    println("${car.getBrand()}\n${car.color}\n${car.maxSpeed}\n${car.model}\n${car.year}")
    println()
    println("${engine.getApplication()}\n${engine.powerMw}\n${engine.speedRpm}\n${engine.torque}\n${engine.weightTon}")
    println()
    println("${animal.getName()}\n${animal.classs}\n${animal.noOfLeg}\n${animal.isDomestic}\n${animal.color}")
    println()
    println("${drone.lat}\n${drone.long}\n${drone.elevation}\n${drone.speed}\n${drone.getIsAutoMode()}")
}