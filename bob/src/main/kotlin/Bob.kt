import kotlin.streams.toList

object Bob {
//    fun hey(input: String): String {
//        if(input.trim().isEmpty())
//            return "Fine. Be that way!"
//
//        var allCapital = input.toCharArray().all { if(it.isLetter()) it.isUpperCase() else true}&& input.contains("[A-Z]".toRegex())
//        val isQuestion =input.trimEnd().toCharArray().last() == '?'
//
//        if(allCapital){
//            return if(isQuestion)
//                "Calm down, I know what I'm doing!"
//            else
//                "Whoa, chill out!"
//        }
//        if(isQuestion)
//            return "Sure."
//        return "Whatever."
//
//    }

    fun hey(prompt: String): String {
        return when {
            prompt.isYelling() && !prompt.isQuestion()-> "Whoa, chill out!"
            prompt.isYelling() && prompt.isQuestion()-> "Calm down, I know what I'm doing!"
            prompt.isQuestion() -> "Sure."
            prompt.isSilence() -> "Fine. Be that way!"
            else -> "Whatever."
        }
    }
    private fun String.isQuestion(): Boolean = trim().endsWith("?")
    private fun String.isSilence(): Boolean = isBlank()
    private fun String.isYelling(): Boolean {
        return !letters().isSilence() and letters().isUpperCase()
    }
    private fun String.isUpperCase(): Boolean  = all(Char::isUpperCase)
    private fun String.letters(): String  = filter(Char::isLetter)
}
