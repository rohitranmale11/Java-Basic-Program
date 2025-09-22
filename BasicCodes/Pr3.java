import java.util.Scanner;

public class Pr3 {  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int count = 0;
        int digit = 0;

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        while ( num > 0) {
            digit = num % 10;
            num = num / 10;
            count++;
        }

        System.out.println("The number of digits in the given number is: " + count);
    }
}
