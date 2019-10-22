import java.util.Scanner;

public class Main {

    public static void main(String [] args) {

        Scanner scanner = new Scanner(System.in);

        int positionInFibNotSeries = scanner.nextInt();

        int predOfPred = 1;
        int pred = 2;
        int currentNumber = 3;

        while(positionInFibNotSeries > 0) {

            /*Simple fibonacci number logic.*/
            predOfPred = pred;
            pred = currentNumber;
            currentNumber = predOfPred + pred;

            /*Denotes the non-fibonacci number between currentNumber and pred.*/
            positionInFibNotSeries = positionInFibNotSeries - (currentNumber - pred - 1);
        }

        /*To remove the negativity if occurs.*/
        positionInFibNotSeries = positionInFibNotSeries + (currentNumber - pred - 1);

        System.out.println(pred + positionInFibNotSeries);
    }
}
