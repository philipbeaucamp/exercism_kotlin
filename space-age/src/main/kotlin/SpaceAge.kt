import java.math.RoundingMode

class SpaceAge(var seconds: Int) {

    fun onEarth(): Double = relative(1.0)
    fun onMercury(): Double = relative(0.2408467)
    fun onVenus(): Double = relative(0.61519726)
    fun onMars(): Double = relative(1.8808158)
    fun onJupiter(): Double = relative(11.862615)
    fun onSaturn(): Double = relative(29.447498)
    fun onUranus(): Double = relative(84.016846)
    fun onNeptune(): Double = relative(164.79132)

    var rule = seconds.toDouble() / 31557600
    private fun format(value : Double) = value.toBigDecimal().setScale(2,RoundingMode.HALF_UP).toDouble()
    private fun relative(value : Double) = format(rule / value)
}
