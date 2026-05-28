fun simpleInterest(p: Int, r: Int, t: Int): Int {
    return (p * r * t) / 100
}
fun main() {
    val p = 10000
    val r = 10
    val t = 2
    println("Simple Interest = ${simpleInterest(p, r, t)}")
}
