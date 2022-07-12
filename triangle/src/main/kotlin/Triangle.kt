//class Triangle<out T : Number>(private val a: T, private val b: T, private val c: T) {
//
//
//    private val isValid : Boolean = (a != 0 && b != 0 && c != 0)
//            && a.toDouble() + b.toDouble() > c.toDouble()
//            && a.toDouble() + c.toDouble() > b.toDouble()
//            && b.toDouble() + c.toDouble() > a.toDouble()
//
//    val isEquilateral: Boolean = if(isValid) a == b && a == c else throw IllegalArgumentException()
//    val isIsosceles: Boolean = if(isValid) a == b || b == c || a == c else throw IllegalArgumentException()
//    val isScalene: Boolean = if(isValid) a != b && a != c && b != c else throw IllegalArgumentException()
//}

class Triangle(val a: Double, val b: Double, val c: Double) {
    constructor(side1Length: Int, side2Length: Int, side3Length: Int):
            this(side1Length.toDouble(), side2Length.toDouble(), side3Length.toDouble())
    init {
        val sideLengths = listOf(a, b, c)
        require(sideLengths.all { it > 0 } && sideLengths.all { sideLengths.minus(it).sum() >= it })
    }
    private val uniqueSideLengths = setOf(a, b, c)
    val isEquilateral = uniqueSideLengths.size == 1
    val isIsosceles = uniqueSideLengths.size <= 2
    val isScalene = uniqueSideLengths.size == 3
}