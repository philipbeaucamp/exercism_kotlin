class Dna(private val dna: String) {
    private var allowed = "ACGT"
    init
    {
        require(dna.all { it in allowed})
    }
    val nucleotideCounts: Map<Char, Int>
        get() = mutableMapOf<Char,Int>().apply {
            allowed.forEach { this[it] = dna.count{d->d ==it} } 
    }
}
