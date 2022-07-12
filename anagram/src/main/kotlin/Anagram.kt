import kotlin.streams.toList

class Anagram(val word: String) {
    fun match(words: List<String>): List<String> {
        return words.filter { isAnagram(it) }
    }
    private fun isAnagram(other: String): Boolean {
        if(word.length != other.length || word.equals(other, ignoreCase=true)) {
            return false
        }
        val sorted1 = word.toLowerCase().toCharArray().sorted()
        val sorted2 = other.toLowerCase().toCharArray().sorted()
        return sorted1 == sorted2
    }
}

//class Anagram(val source :String) {
//
//
//    fun match(anagrams: Collection<String>): Set<String> {
//        return anagrams.filter { word ->
//            word.length == source.length && word.lowercase().chars().toList().groupBy { it }
//                .equals(source.lowercase().chars().toList().groupBy { it }) && word.lowercase() != source.lowercase()
//        }.toSet()
//    }
//
//}
