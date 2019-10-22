import java.util.Scanner;

public class P2807 {
    
    private static int nthValueOfFibonacci(int n) {
        if(n == 1) return 1;
        if(n == 2) return 1;
        else return nthValueOfFibonacci(n-1) + nthValueOfFibonacci(n-2);
    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        
        if(n == 1) System.out.println(1);
        else {
            do {
                System.out.print(nthValueOfFibonacci(n) + " ");
            } while(--n > 1);
            
            System.out.println(nthValueOfFibonacci(1));
        }
    }
}