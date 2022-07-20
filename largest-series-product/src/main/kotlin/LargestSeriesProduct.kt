
//class Series(val series: String) {
//
//    fun getLargestProduct(span: Int): Long {
//
//        if(series.isEmpty() || span < 1)
//            return 0;
//
//        print("checking out string $series with span $span")
//        val max = (series.indices).maxOf { index ->
//            series.substring(index, max(0,min(index+span-1,series.length-1))).map { it.toLong() }.fold(1.toLong()){ sum, element ->
//                sum * element
//            }
//        }
//        return max;
//    }
//}

class Series(val digits: String) {
    init {
        require(digits.all { it.isDigit() })
    }


    fun getLargestProduct(n: Int): Long {
        require(n <= digits.length)
        return if (n == 0 || digits.isEmpty()) 1 else maxProduct(n)
    }
    private fun maxProduct(n: Int) : Long =
        digits.windowed(n, 1).maxOf {
            it.fold(1) { acc, v -> acc * (v - '0') }
        }.toLong()
}