import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int totalSpaces = sc.nextInt();
        int numberOfCardsBought = sc.nextInt();

        int[] cardCounter = new int[totalSpaces + 1]; /*As, index starts with 0.*/
        while(numberOfCardsBought-- != 0) {
            cardCounter[sc.nextInt()]++;
        }

        int emptySpaces = -1; /*As, we want to de-count 0 index.*/
        for(int i: cardCounter) {
            if(i == 0) emptySpaces++;
        }

        System.out.println(emptySpaces);
    }
}
