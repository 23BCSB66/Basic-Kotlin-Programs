fun main() {
    print("Enter a number: ")
    val num = 6
    var factorial = 1
    for (i in 1..num) {
        factorial = factorial*i
    }
    println("Factorial = $factorial")
}
