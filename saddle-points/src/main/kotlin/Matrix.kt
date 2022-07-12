data class MatrixCoordinate(val row: Int, val col: Int)

class Matrix(val rows : List<List<Int>>){

    private val columns by lazy{ (0 until rows[0].size).map {i -> rows.map { it[i] }}}
    private val maxInRow by lazy{ rows.map {it.maxOrNull()}}
    private val minInCol by lazy { columns.map{it.minOrNull()}}

    val saddlePoints: Set<MatrixCoordinate> =
        rows.mapIndexed { x,row ->
            row.mapIndexedNotNull{y, it ->
                if(it == maxInRow[x] && it == minInCol[y]){
                    MatrixCoordinate(x+1,y+1)
                } else null
            }
        }.flatten().toSet()
}

