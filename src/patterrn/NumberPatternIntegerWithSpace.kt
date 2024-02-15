package patterrn
import java.util.*

/**
 * Print below pattern
 *
 * Input: Enter the number : 5
 *
 * Output:
 *          1
 * 		   2 3
 * 		  4 5 6
 * 		 7 8 9 10
 * 		11 12 13 14 15
 *
 *
 */

fun main() {
    val num: Int
    var a = 0   // a = 1;

    val `in` = Scanner(System.`in`)
    print("Enter the number: ")
    num = `in`.nextInt()

    for (i in 1..num) {
        // print space
        for (sp in num - i downTo 1) {
            print(" ")
        }

        // print pattern
        for (j in 1..i) {
            a++
            print("$a ")

            // a++;
        }
        // print next line
        println()
    }
}
