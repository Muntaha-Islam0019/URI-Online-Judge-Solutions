import java.util.Scanner;

public class P2057 {
    
    public static void main (String [] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int s, t, f;
        
        s = sc.nextInt();
        t = sc.nextInt();
        f = sc.nextInt();
        
        int sum = (s + t + f) % 24;
        
        if (sum < 0) sum = 24 + sum;
        
        System.out.printf("%d\n", sum);
    }
}