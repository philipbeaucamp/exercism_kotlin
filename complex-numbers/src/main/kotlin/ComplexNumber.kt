import kotlin.math.cos
import kotlin.math.exp
import kotlin.math.pow
import kotlin.math.sin

data class ComplexNumber(val real: Double = 0.0, val imag: Double = 0.0){

    operator fun plus(other : ComplexNumber) : ComplexNumber{
        return ComplexNumber(real+other.real,imag+other.imag)
    }

    operator fun minus(other : ComplexNumber) : ComplexNumber{
        return ComplexNumber(real-other.real,imag-other.imag)
    }

    operator fun times(other : ComplexNumber) : ComplexNumber{
        return ComplexNumber(real*other.real -imag * other.imag,imag* other.real + real * other.imag)
    }
    operator fun div(other : ComplexNumber) : ComplexNumber{
        return ComplexNumber(
         (real*other.real + imag *other.imag)/(other.real.pow(2) + other.imag.pow(2)),
        (imag * other.real - imag * other.imag)/(other.real.pow(2) + other.imag.pow(2)))
    }

    var abs : Double = Math.sqrt(real.pow(2) + imag.pow(2))
    fun conjugate() = ComplexNumber(real,-imag)
    fun exponential(c: ComplexNumber) = ComplexNumber(exp(c.real) * cos(c.imag), exp(c.real)* sin(c.imag))
}

