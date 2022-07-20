object Acronym {
    fun generate(phrase: String) : String {
        return phrase.split(" ","-","_")
            .map { if(it.firstOrNull() {it != '_' && it != ' ' && it != '-' } == null) "" else it.first()  }
            .joinToString ("").uppercase();
    }
}

//object Acronym {
//    fun generate(phrase: String) = Regex("[A-Z]+[a-z]*|[a-z]+").findAll(phrase)
//        .map { it.value.first().toUpperCase() }.joinToString("")
//}
