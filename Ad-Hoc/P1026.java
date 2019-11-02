import java.util.Scanner;
public class P1026 { 
    
    public static void main(String[] args) { 
        
        Scanner sc = new Scanner(System.in);
        long x, y, ans;  
        
        while (sc.hasNext()) {  
            
            x = sc.nextLong(); 
            y = sc.nextLong(); 
            
            System.out.println(x^y);
        } 
    }
}