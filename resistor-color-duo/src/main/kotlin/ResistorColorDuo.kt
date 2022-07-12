object ResistorColorDuo {

//    fun value(vararg colors: Color): Int {
//        return colors.map { it.ordinal}.take(2).joinToString("").toInt()
//    }

    fun value(vararg colors: Color): Int =
        colors
            .take(2)
            .fold(0) { value, color -> value * 10 + color.ordinal }
}
