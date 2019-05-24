import java.util.Scanner ;
public class P1145 {
    
    public static void main(String[] args) {
        int X,Y;
        Scanner input =new Scanner(System.in);
        X = input.nextInt();
        Y = input.nextInt();
        for (int i = 1; i <= Y ; ) {
            for (int count = 1 ; count <= X ; count++ , i++) {
                if ( count != X ) {
                    System.out.print(i+" ");
                } else {
                    System.out.print(i);
                }
            }
            System.out.println();
        }
        
    }
    
}