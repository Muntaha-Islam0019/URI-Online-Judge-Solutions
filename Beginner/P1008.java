import java.util.Scanner;



public class P1008 {

    public static void main(String[] args){

       int a,b;

       float c;

       Scanner sc =new Scanner(System.in);

       a = sc.nextInt();

       b = sc.nextInt();

       c = sc.nextFloat();

       System.out.printf("NUMBER = %d\n", a);

       System.out.printf("SALARY = U$ %.2f\n", b * c);

    }



}