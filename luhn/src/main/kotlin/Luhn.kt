object Luhn {

    fun isValid(candidate: String): Boolean {

        val cleanInput = candidate.filterNot { it.isWhitespace() }
        val isValid = cleanInput.length > 1 && cleanInput.all { it.isDigit() }

        return  isValid && cleanInput.reversed()
            .foldIndexed(0){index,acc,c ->
                acc + if(index % 2== 1){
                    if(c.digitToInt() * 2 > 9)
                        c.digitToInt() * 2 - 9
                    else
                        c.digitToInt() * 2
                } else c.digitToInt()
            } % 10 == 0
    }
}
