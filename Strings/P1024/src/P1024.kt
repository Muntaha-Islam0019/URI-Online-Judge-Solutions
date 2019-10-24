fun main(args: Array<String>) {

    val testCases = readLine()?.toInt()!!

    for (i in 1..testCases) {

        val text = readLine().toString()
        var newText = ""

        for (j in text) {
            newText += if (j.isLetter()) {
                (j.toByte().toInt() + 3).toChar()
            } else {
                j
            }
        }

        newText = newText.reversed()
        val half = (newText.length / 2)
        val firstPart = newText.substring(0, half)
        val secondPart = newText.substring(half, newText.length)
        var thirdPart = ""

        for (k in secondPart) {
            thirdPart += (k.toByte().toInt() - 1).toChar()
        }

        val encryptedText = firstPart + thirdPart
        print("$encryptedText\n")
    }
}