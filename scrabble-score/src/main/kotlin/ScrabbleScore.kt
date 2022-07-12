object ScrabbleScore {

//    fun scoreLetter(c: Char): Int =
//        when(c.lowercase()){
//            "a","e","i","o","u","l","n","r","s","t" -> 1
//            "d","g" ->2
//            "b","c","m","p" -> 3
//            "f","h","v","w","y" -> 4
//            "k" -> 5
//            "j","x" -> 8
//            "q","z" -> 10
//            else -> {0}
//        }
//
//
//    fun scoreWord(word: String): Int = word.sumOf { scoreLetter(it) }

        fun scoreWord(input: String) =
            input.toUpperCase().sumBy { when (it) {
                in "DG" -> 2
                in "BCMP" -> 3
                in "FHVWY" -> 4
                'K' -> 5
                in "JX" -> 8
                in "QZ" -> 10
                else -> 1
            } }
}
