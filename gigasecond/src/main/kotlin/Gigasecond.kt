import java.time.Duration
import java.time.LocalDateTime
import java.time.LocalDate
import java.time.Instant
import java.util.*

class Gigasecond(date: LocalDateTime) {

    val date: LocalDateTime = date.plusSeconds(1_000_000_000)

    constructor(date: LocalDate) : this(date.atStartOfDay())

}
