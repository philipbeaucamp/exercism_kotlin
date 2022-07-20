class PhoneNumber(input:String) {

    var cleansed : String = ""
    init
    {
        cleansed = input.filter { it.isDigit() }
            .mapIndexed{index,c -> if(index ==0 && c == '1') "" else c}
            .joinToString("")
        require(cleansed.length == 10)
        require(cleansed.count { it == '1'} == 0)
        require(cleansed[0] != '0' && cleansed[3] != '0')
    }

    val number: String? = cleansed

}


