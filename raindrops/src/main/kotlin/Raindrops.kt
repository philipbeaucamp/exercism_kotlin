object Raindrops {

    fun convert(num: Int): String = buildString {
        if (num % 3 == 0) append("Pling")
        if (num % 5 == 0) append("Plang")
        if (num % 7 == 0) append("Plong")
        if(isEmpty()) append(num)
    }

//    fun convert(n: Int): String {
//        var output: String = ""
//        output += if( n % 3 == 0)  "Pling" else ""
//        output += if( n % 5 == 0)  "Plang" else ""
//        output += if( n % 7 == 0)  "Plong" else ""
//        if(output.isBlank())
//            return n.toString()
//        return output
//    }
}
