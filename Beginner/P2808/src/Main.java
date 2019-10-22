import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String str = sc.nextLine();
        char[] charArray = str.toCharArray();

        char[] chars = new char[2];
        int[] ints = new int[2];

        int counterOfChars = 0;
        int counterOfInts = 0;

         for(char c: charArray) {
             if(c != ' ') {
                 if(c >= 'a' && c<= 'z') chars[counterOfChars++] = c;
                 else ints[counterOfInts++] = c;
             }
         }

        /*System.out.println(Math.abs((int)chars[1]));
        System.out.println(Math.abs((int)chars[0]));
        System.out.println(ints[1]);
        System.out.println(ints[0]);*/

         if(((Math.abs((int)chars[1] - (int)chars[0]) == 2) && (Math.abs(ints[1] - ints[0]) == 1)) ||
                 ((Math.abs((int)chars[1] - (int)chars[0]) == 1) && (Math.abs(ints[1] - ints[0]) == 2))) {
             System.out.println("VALIDO");
         } else {
             System.out.println("INVALIDO");
         }
    }
}