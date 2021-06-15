//NOTE THIS IS A CLASS AND NO FUNCTION HERE AS MAIN
/*
Define 5 Classes; let each class definition contain at least
5 instance variables; let each class contain at least 1
constructor.
 */

// there are 10 classes declare below

class Phone constructor(_brand: String = "Unknown", _ram: String = "Unknown", _storage: String = "Unknown",
                        _size: String="Unknown",_color: String ="Unknown" ) {
    // the above is a primary constructor
    //an example of instance variables
    var brand = _brand
    var ram = _ram
    var storage = _storage
    var size = _size
    var color = _color

    // initializer block
    init {
        brand = "Infinix"
        ram = "4gb"
        storage= "64gb"
        size="60x67x53"
        color="red"
    }
}

class Car constructor(_brand: String = "Unknown", _model: String = "Unknown", _year: Int=0,
                      _color: String="Unknown",_maxSpeed: Int=0  ) {
    // the above is a primary constructor
    //an example of instance variables
    var brand = _brand
    var model = _model
    var year = _year
    var color = _color
    var maxSpeed = _maxSpeed

    // initializer block
    init {
        brand = "Toyota"
        model = "Camery"
        year = 2009
        color = "black"
        maxSpeed = 240
    }
}

class Engine constructor(_speedRpm: Double=0.0 , _powerMw: Double=0.0 , _torque: Double=0.0 ,
                         _weightTon: Double=0.0 , _application: String ="Unknown" ) {
    // the above is a primary constructor
    //an example of instance variables
    var speedRpm = _speedRpm
    var powerMw = _powerMw
    var torque = _torque
    var weightTon = _weightTon
    var application = _application

    // initializer block
    init {
        speedRpm = 3600.00
        powerMw = 17.00
        torque = (60 * powerMw *1000)/(2* Math.PI * speedRpm)
        weightTon = 0.4
        application = "Marine"

    }
}

class Animal constructor(_name: String = "Unknown", _classs: String = "Unknown", _isDomestic: Boolean = false,
                         _noOfLeg: Int=0, _color: String ="Unknown" ) {
    // the above is a primary constructor
    //an example of instance variables
    var name = _name
    var classs = _classs
    var isDomestic = _isDomestic
    var noOfLeg = _noOfLeg
    var color = _color

    // initializer block
    init {
        name = "Dog"
        classs = "mammal"
        isDomestic = true
        noOfLeg = 4
        color = "multi-color"
    }
}

class Drone constructor(_lat: Double = 0.0, _long: Double = 0.0, _speed: Double = 0.0,
                        _elevation: Double=0.0, _isAutoMode: Boolean = false ) {
    // the above is a primary constructor
    //an example of instance variables
    var lat = _lat
    var long = _long
    var speed = _speed
    var elevation = _elevation
    var isAutoMode = _isAutoMode

    // initializer block
    init {
        lat = 56.0909
        long = 66.0056
        speed = 340.7
        elevation = 56.00
        isAutoMode = false
    }
}