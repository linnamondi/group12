fun main() {
    println(isPrime(8))
}
fun isPrime(number: Int): Boolean {
    if (number <= 1) {
        return false
    }
    for (i in 1..Math.sqrt(number.toDouble()).toInt()) {
        if (number % i == 0) {
            return false
        }
    }
    return true
}