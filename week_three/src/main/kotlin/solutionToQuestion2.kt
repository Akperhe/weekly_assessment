/*
Write a short program that prints the reverse of a string that is suplied.
you can assume that the string passed will never be empty or null.
When given the  string "Good food", the output should be "doof dooG".
*/

// this function reverse input string
fun reverseInput(input: String): String {
    var rev: String = ""

    for (i in input.length - 1 downTo 0) {
        rev += input[i].toString()
    }
    return rev
}
