fun main() {
    val n = 12
    var a = 0
    var b = 1
    for (i in 1..n) {
        print("$a ")
        val next = a + b
        a = b
        b = next
    }
}
