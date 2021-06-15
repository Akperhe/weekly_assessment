/*
Using a loop and the modulus operator, write a program
which will print out only the even numbers between 10 and
20 and the odd numbers between 20 and 30: NB: Use
only one loop
 */

fun main() {
    for (i in 10..30) {
        if (i % 2 == 0 && i >= 10 && i <= 20)
            print("$i ")
        if (i==20)
            println() // to jump to new line
        if (i % 2 == 1 && i >= 20 && i <= 30)
            print("$i ")
    }
}