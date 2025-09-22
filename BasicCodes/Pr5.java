import java.util.Scanner;
public class Pr5 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int sum = 0;    

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        for ( int i =1; i<=num; i++){
            if( i % 2 == 0) {  
                sum = sum + i;
            }
        }

        System.out.println("The sum of all the even number is: " + sum);
    }
}
