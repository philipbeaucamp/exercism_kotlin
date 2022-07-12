object Pangram {


    fun isPangram(input:String) :Boolean = ('a'..'z').all { it in input.lowercase()}

//    fun isPangram(input: String): Boolean {
//        var modified = input.lowercase()
//        for(a in 'a'..'z')
//            if(a !in modified)
//                return false;
//        return true;
//    }
}
