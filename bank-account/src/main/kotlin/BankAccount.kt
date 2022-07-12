class BankAccount {
    private var isOpen = true
    var balance: Int = 0
        get() { check(isOpen); return field }
        private set

    fun adjustBalance(amount: Int) {
        check(isOpen)
        synchronized(this) {
            this.balance += amount
        }
    }
    fun close() {
        isOpen = false
    }
}


//class BankAccount(var balance: Long = 0) {
//
//    private var isClosed : Boolean = false
//
//    init {
//        balance = 0
//        isClosed = false
//    }
//
//    fun adjustBalance(amount: Long){
//
//        if(isClosed)
//            throw IllegalStateException()
//
//        balance += amount
//    }
//
//    fun close() {
//        balance = 0
//        isClosed = true
//    }
//}
