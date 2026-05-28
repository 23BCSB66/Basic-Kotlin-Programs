fun main() {
    var a = 10
    var b = 20
    println("Before Swapping")
    println("a = $a")
    println("b = $b")
    val temp = a
    a = b
    b = temp
    println("After Swapping Using Third Variable")
    println("a = $a")
    println("b = $b")
    a = 10
    b = 20
    a = a + b
    b = a - b
    a = a - b
    println("After Swapping Without Third Variable")
    println("a = $a")
    println("b = $b")
}
