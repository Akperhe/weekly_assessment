fun main() {
/*
Question 1-> Define 10 if statements and
5 conditional expression using the when keyword
*/

/*
the below is the syntax for defining an "if statement" in kotlin
    if (conditions) {
    statement/body
     }
 */
    // Example below
    var validUserInput: Int = 0

    if (validUserInput == 1) {

    }
    if (validUserInput == 2) {

    }
    if (validUserInput == 3) {

    }
    if (validUserInput == 4) {

    }
    if (validUserInput == 5) {

    }
    if (validUserInput == 6) {

    }
    if (validUserInput == 7) {

    }
    if (validUserInput == 8) {

    }
    if (validUserInput == 9) {

    }
    if (validUserInput == 10) {

    }

//5 conditional expression using the when keyword
/*
  the below are two the form of syntax for defining an "when expression/Statement" in kotlin

    when {
        condition -> statement/results
        condition2 -> statement/results
        else -> statement/results
    }

    when (conditions) {
            cases-> statement/results
            moreCases -> statement/results
            else -> statement/results
     }
 */

// 5 Examples of when expression/statements
    val x = 100
    val y = 10

    println("Enter operator either +, -, *, / or ^\nthe user is assumed to enter ^ which is hardcode")
    val operator = "^" // here it is hard coded but can be softcode using readLine function

    when (operator) {
        "+" -> println("$x + $y = ${x + y}") // output using string template
        "-" -> println("$x - $y = ${x - y}")
        "*" -> println(x.toString() + " * " + y + " = " + x * y) // output using of string concatenation
        "/" -> println("$x / $y = ${x / y}")
        "^" -> println("$x ^ $y = ${Math.pow(x.toDouble(), y.toDouble())}")
    }

//#2 when used as expression
    val ans: Int = 200
    val result: String = when (ans) {
        200 -> "Answer is right"
        100 -> "You are closer"
        else -> "Try again"
    }

//#3 when used as an expression and without argument
    var test: Boolean = false
    val status: String = when {
        test == true -> "Result of test is positive"
        test == false -> "Result of test is negative"
        else -> "Unknown status"
    }

//#4
    val daysOfWeek: Int = 3 // number equivalent to weekdays

    when {
        daysOfWeek == 1 -> println("Monday")
        daysOfWeek == 2 -> println("Tuesday")
        daysOfWeek == 3 -> println("Wednesday")
        daysOfWeek == 4 -> println("Thursday")
        daysOfWeek == 5 -> println("Friday")
        daysOfWeek == 6 -> println("Saturday")
        daysOfWeek == 7 -> println("Sunday")
        else -> println("Unknown Category")
    }

//#5 when executing a block of statement
    val constant: Int = 60
    var factor: Int = 2
    var outcome: Int = 0
    when (factor) {
        1 -> {
            outcome = factor * constant
            println("multiply by a certain constant by the factor $factor gives $outcome")
        }
        2 -> {
            outcome = factor * constant
            println("multiply by a certain constant by the factor $factor gives $outcome")
        }
        3 -> {
            outcome = factor * constant
            println("multiply by a certain constant by the factor $factor gives $outcome")
        }
        4 -> {
            outcome = factor * constant
            println("multiply by a certain constant by the factor $factor gives $outcome")
        }
        5 -> {
            outcome = factor * constant
            println("multiply by a certain constant by the factor $factor gives $outcome")
        }
        else -> println("Factor must be between 1 and 5")
    }
}



