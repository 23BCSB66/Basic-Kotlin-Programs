fun largest(a: Int, b: Int, c: Int): Int {
    if (a >= b && a >= c) {
        return a
    } else if (b >= a && b >= c) {
        return b
    } else {
        return c
    }
}
fun main() {
    val a = 4
    val b = 6
    val c = 2
    println("Largest = ${largest(a, b, c)}")
}
