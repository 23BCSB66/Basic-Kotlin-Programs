fun main() {
    print("Enter a number: ")
    var num = 4567
    var count = 0
    while (num != 0) {
        num /= 10
        count++
    }
    println("Digits = $count")
}
