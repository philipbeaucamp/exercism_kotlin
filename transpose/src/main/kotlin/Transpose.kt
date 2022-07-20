object Transpose {

//    fun transpose(input: List<String>): List<String> {
//        if(input.isEmpty())
//            return emptyList()
//        return (0 until input.maxOf { it?.length ?: 0 }).
//        map  { index -> input.mapIndexed { rowIndex, s ->
//            if(index >= s.length){
//                if(rowIndex == input.size-1)
//                    ""
//                else
//                    " "
//            }
//            else{
//                s[index]
//            }
//        }
//        .joinToString("") }
//    }

    fun transpose(input: List<String>): List<String> {
        var rez: MutableList<String> = mutableListOf()
        input.forEachIndexed { i, it  ->
            it.forEachIndexed { index, c ->
                if (rez.size<=index) rez.add(index, "".padEnd(i,' ')+c)
                else rez[index] = rez[index].padEnd(i,' ')+c
            }
        }
        return rez
    }
}
