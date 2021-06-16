//NOTE THIS IS A CLASS AND NO FUNCTION HERE AS MAIN
/*
Question 5-> Define 5 Classes; let each class definition contain at least
5 instance variables; let each class contain at least 1
constructor.
 */

// there are 5 classes declare below
class Phone(_brand: String = "defualt") {
    // the above is a primary constructor
    // class instance variables
    private var brand: String = _brand
    private var ram: Int = 0
    private var storage: Int = 0
    private var size: String = ""
    private var color: String = ""

    // initializer block
    init {
        brand = _brand
    }

    // secondary constructor
    constructor(brand: String, size: String) : this(brand) {
        this.size = size
    }

    // Functions of setter and getters are declare below
    fun getBrand(): String {
        return brand
    }

    fun setBrand(brand: String) {
        this.brand = brand
    }

    fun getRam(): Int {
        return ram
    }

    fun setRam(ram: Int) {
        this.ram = ram
    }

    fun getStorage(): Int {
        return storage
    }

    fun setStorage(storage: Int) {
        this.storage = storage
    }

    fun getSize(): String {
        return size
    }

    fun setSize(size: String) {
        this.size = size
    }

    fun getColor(): String {
        return color
    }

    fun setColor(color: String) {
        this.color = color
    }
}

class Car(_brand: String = "") {
    // the above is a primary constructor
    //an example of instance variables
    private var brand: String = _brand
    private var model: String = ""
    private var year: Int = 0
    private var color: String = ""
    private var maxSpeed: Int = 0

    // initializer block
    init {
        brand = _brand

    }

    // Functions of setter and getters are declare below
    fun getBrand(): String {
        return brand
    }

    fun setBrand(brand: String) {
        this.brand = brand
    }

    fun getModel(): String {
        return model
    }

    fun setModel(model: String) {
        this.model = model
    }

    fun getYear(): Int {
        return year
    }

    fun setYear(year: Int) {
        this.year = year
    }

    fun getColor(): String {
        return color
    }

    fun setColor(color: String) {
        this.color = color
    }

    fun getMaxSpeed(): Int {
        return maxSpeed
    }

    fun setMaxSpeed(maxSpeed: Int) {
        this.maxSpeed = maxSpeed
    }
}

class Engine(_application: String = "") {
    // the above is a primary constructor
    //an example of instance variables
    private var application: String = _application
    private var speedRpm: Double = 0.0
    private var powerMw: Double = 0.0
    private var torque: Double = 0.0
    private var weightTon: Double = 0.0

    // initializer block
    init {
        application = _application
    }

    // Functions of setter and getters are declare below
    fun getApplication(): String {
        return application
    }

    fun setApplication(brand: String) {
        this.application = application
    }

    fun getWeightTon(): Double {
        return weightTon
    }

    fun setWeightTon(weightTon: Double) {
        this.weightTon = weightTon
    }

    fun getTorque(): Double {
        return torque
    }

    fun setTorque(torque: Double) {
        this.torque = torque
    }

    fun getPowerMw(): Double {
        return powerMw
    }

    fun setPowerMw(powerMw: Double) {
        this.powerMw = powerMw
    }

    fun getSpeedRpm(): Double {
        return speedRpm
    }

    fun setSpeedRpm(speedRpm: Double) {
        this.speedRpm = speedRpm
    }
}

class Animal(_name: String = "Unknown") {
    // the above is a primary constructor
    //an example of instance variables
    private var name: String = _name
    private var classs: String = ""
    private var isDomestic: Boolean = false
    private var noOfLegs: Short = 0
    private var color: String = ""

    // initializer block
    init {
        name = _name
    }

    // secondary constructor
    constructor(noOfLegs: Short) : this() {
        this.noOfLegs = noOfLegs
    }

    // Functions of setter and getters are declare below
    fun getName(): String {
        return name
    }

    fun setName(name: String) {
        this.name = name
    }

    fun getClasss(): String {
        return classs
    }

    fun setClasss(classs: String) {
        this.classs = classs
    }

    fun getIsDomestic(): Boolean {
        return isDomestic
    }

    fun setIsDomestic(isDomestic: Boolean) {
        this.isDomestic = isDomestic
    }

    fun getNoOfLegs(): Short {
        return noOfLegs
    }

    fun setNoOfLegs(noOfLegs: Short) {
        this.noOfLegs = noOfLegs
    }

    fun getColor(): String {
        return color
    }

    fun setColor(color: String) {
        this.color = color
    }
}

class Drone(_isAutoMode: Boolean = false) {
    // the above is a primary constructor
    //an example of instance variables
    private var lat: Double = 0.0
    private var long: Double = 0.0
    private var speed: Double = 0.0
    private var elevation: Double = 0.0
    private var isAutoMode: Boolean = false

    // initializer block
    init {
        isAutoMode = _isAutoMode
    }

    // Functions of setter and getters are declare below
    fun getIsAutoMode(): Boolean {
        return isAutoMode
    }

    fun setIsAutoMode(isAutoMode: Boolean) {
        this.isAutoMode = isAutoMode
    }

    fun getElevation(): Double {
        return elevation
    }

    fun setElevation(elevation: Double) {
        this.elevation = elevation
    }

    fun getSpeed(): Double {
        return speed
    }

    fun setSpeed(speed: Double) {
        this.speed = speed
    }

    fun getLong(): Double {
        return long
    }

    fun setLong(long: Double) {
        this.long = long
    }

    fun getLat(): Double {
        return lat
    }

    fun setLat(lat: Double) {
        this.lat = lat
    }
}