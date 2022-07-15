object BeerSong {
    fun verses(startBottles: Int, takeDown: Int) : String {

        var rst : String = "";
        for(i in startBottles downTo takeDown)
        {
            var bottles = if(i != 2 ) "bottles" else "bottle"
            rst += if(i > 1)
                "$i bottles of beer on the wall, $i bottles of beer.\nTake one down and pass it around, ${i-1} $bottles of beer on the wall.";
            else if(i ==1)
                "$i bottle of beer on the wall, $i bottle of beer.\nTake it down and pass it around, no more bottles of beer on the wall.";
            else
                "No more bottles of beer on the wall, no more bottles of beer.\nGo to the store and buy some more, 99 bottles of beer on the wall."

            rst += "\n"
            if(i > takeDown)
                rst +="\n"
        }
        return rst;
    }
}
