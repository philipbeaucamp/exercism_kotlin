//class IsbnVerifier {
//
//    fun isValid(number: String): Boolean {
//
//        if(number.isEmpty())
//            return false;
//        if(!number.last().isDigit() && number.last().toChar() != 'X')
//            return false;
//        var n = number.filter { it.isLetterOrDigit()}.mapIndexed { index, c ->
//            if(c == 'X' && index != number.length-1)
//                return false;
//            if(c == 'X'){
//                print("in x")
//                10
//            }
//            else
//                c.toInt()
//        }.foldIndexed(0){index,sum,element ->  sum + element * (10-index) } %11;
//
//        return n ==0;
//
//    }
//}
class IsbnVerifier {
    fun isValid(isbn: String): Boolean = isbn
        .filter { it.isDigit() || it == 'X' }
        .apply { if (indexOf('X') !in listOf(-1, 9)) return false }
        .apply { if (length != 10) return false }
        .map { if (it == 'X') 10 else Character.getNumericValue(it) }
        .foldIndexed(0) { pos, x, digitValue -> x + (10 - pos) * digitValue }
        .rem(11) == 0
}