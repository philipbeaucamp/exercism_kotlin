object WordCount {

    fun phrase(phrase: String): Map<String, Int> {
        return phrase.lowercase()
            .split(Regex("[^a-zA-Z\\d']+"))
            .filter(String::isNotEmpty)
            .groupBy { it }.mapValues { it.value.size }
    }
}

fun main(){
    var w = WordCount
    w.phrase(""""That's the password: 'PASSWORD 123'!", cried the Special Agent.\nSo I fled.""")
}
