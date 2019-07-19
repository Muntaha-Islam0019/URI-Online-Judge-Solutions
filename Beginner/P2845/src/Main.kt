import java.util.Scanner

object Main {
    @JvmStatic
    fun main(args: Array<String>) {

        val sc = Scanner(System.`in`)

        var numberOfLeprechauns = sc.nextInt()
        var maximum = sc.nextInt()

        numberOfLeprechauns--

        while (numberOfLeprechauns-- > 0) {
            val tempNum = sc.nextInt()
            if (maximum < tempNum) maximum = tempNum
        }

        println(maximum + 1)
    }
}
