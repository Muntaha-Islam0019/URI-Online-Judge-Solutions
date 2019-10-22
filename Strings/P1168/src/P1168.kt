fun main(args: Array<String>) {

    val testCases = readLine()!!.toInt()

    for (i in 1..testCases) {

        var summation = 0
        val numbers = readLine()

        val ledNeeded = mutableMapOf(
            '0' to 6,
            '1' to 2,
            '2' to 5,
            '3' to 5,
            '4' to 4,
            '5' to 5,
            '6' to 6,
            '7' to 3,
            '8' to 7,
            '9' to 6
        )

        if (numbers != null) {
            for (number in numbers) {
                summation += ledNeeded[number]!!
            }
        }

        print("$summation leds\n")
    }
}