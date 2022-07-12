private val lowercase = ('a'..'z').toList()
private val uppercase = ('A'..'Z').toList()

private fun buildKey(chars : List<Char>, rot: Int) : Map<Char,Char> =
    chars.zip(chars.drop(rot) + chars.take(rot)).toMap()

class RotationalCipher(private val rot: Int) {

    private val key = buildKey(lowercase, rot) + buildKey(uppercase,rot)
    fun encode(source: String) : String = source.map{c -> key[c] ?: c}.joinToString("")

//    fun encode(text: String): String {
//        return text.map {
//            val wasLower = it.isLowerCase()
//            var rst = it
//            rst = when (it.lowercaseChar()) {
//                in ('a'..'z') -> shift(it.lowercaseChar())
//                else -> it
//            }
//            if(!wasLower) rst = rst.uppercaseChar()
//            rst
//        }.joinToString("")
//
//    }
//
//    private fun shift(key: Char): Char{
//        val index = ('a'..'z').indexOfFirst { it == key}
//        return  ('a'..'z').elementAt((index + rot) % 26)
//    }

}
