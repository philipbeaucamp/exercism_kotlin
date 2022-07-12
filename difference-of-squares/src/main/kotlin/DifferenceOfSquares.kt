import kotlin.math.abs
import kotlin.math.pow

private fun Int.squared() = this * this

class Squares(private val n: Int) {

    fun squareOfSum() = 1.rangeTo(n).sum().squared()
    fun sumOfSquares() = 1.rangeTo(n).sumOf { it.squared() }
    fun difference() = squareOfSum() - sumOfSquares()
}
