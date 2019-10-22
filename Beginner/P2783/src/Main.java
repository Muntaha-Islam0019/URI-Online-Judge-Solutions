import java.util.HashSet;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);

        int number_of_spaces, number_of_stamps, number_of_purchased;
        number_of_spaces = scanner.nextInt();
        number_of_stamps = scanner.nextInt();
        number_of_purchased = scanner.nextInt();

        HashSet<Integer> hashSet_for_stamps = new HashSet<>();
        
        for (int i = 0; i < number_of_stamps; i++) {
            hashSet_for_stamps.add(scanner.nextInt());
        }

        HashSet<Integer> hashSet_for_purchases = new HashSet<>();

        for (int i = 0; i < number_of_purchased; i++) {
            hashSet_for_purchases.add(scanner.nextInt());
        }

        int counter = 0;
        for (Integer stamp :
                hashSet_for_stamps) {
            if(!hashSet_for_purchases.contains(stamp)) counter++;
        }

        System.out.println(counter);
    }
}
