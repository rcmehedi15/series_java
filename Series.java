
import java.util.Scanner;

public class Series {


    public static void main(String[] args) {
       int n;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Your N Value=" );
        
        n = input.nextInt();
        
        for(int i=2; i<=n; i=i+2)
        {
            System.out.println("Sereis number = "+i);
        }
        
    }
    
}

