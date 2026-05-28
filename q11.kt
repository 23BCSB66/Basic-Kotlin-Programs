fun main() {
    var num = 4398
    var sum = 0
    while (num != 0) {
        val digit = num % 10
        sum = sum + digit
        num /= 10
    }
    println("Sum of digits = $sum")
}
