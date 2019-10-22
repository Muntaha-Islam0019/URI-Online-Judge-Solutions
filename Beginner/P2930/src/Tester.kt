import java.util.Scanner

fun main() {

    val read = Scanner(System.`in`)

    val dateOfDelivery: Int = read.nextInt()
    var endDateOfSubmission: Int = read.nextInt()

    if(endDateOfSubmission - dateOfDelivery <= 0) println("Eu odeio a professora!")
    else {
        if(endDateOfSubmission - dateOfDelivery >= 3) println("Muito bem! Apresenta antes do Natal!")
        else {
            println("Parece o trabalho do meu filho!")

            endDateOfSubmission += 2
            if(endDateOfSubmission <= 24)
                println("TCC Apresentado!")
            else println( "Fail! Entao eh nataaaaal!")
        }
    }
}