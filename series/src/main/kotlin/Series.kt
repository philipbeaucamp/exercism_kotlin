object Series {

    fun slices(n: Int, s: String): List<List<Int>> {
        require( n <= s.length)
        return s.map { it - '0' }.windowed(n)
    }
}
