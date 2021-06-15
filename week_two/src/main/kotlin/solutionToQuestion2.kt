/*
Define a loop which will print out 1 - 100. Also define a
loop which will print out 1 - 10 to the console without
printing out the numbers 4 and 5.
 */
fun main() {
    for (i in 1..100) {
        print("$i ") // we use string template and print function on horizontal line with space
    }
    println()
    for (i in 1..10) {
        if (i != 4 && i != 5)
            print("$i ") // we use string template and print function on horizontal line with space
    }
}
