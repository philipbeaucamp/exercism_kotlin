import kotlin.math.pow

object ArmstrongNumber {

//    fun check(input: Int): Boolean = input.toString().map { it.toString().toInt() }.fold(0.0) { sum, element ->
//        sum + element.toDouble().pow(input.toString().length)
//        } == input.toDouble()


    fun check(input: Int) = "$input".run { sumOf { (it - '0').toDouble().pow(length).toInt() } == input }
}
