import java.util.Scanner;

public class Pr10 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int rem , rev = 0;
        int temp = num;

        while (num > 0) {
            rem = num % 10;
            rev = rev * 10 + rem;
            temp = temp / 10;
        }

        if(rev == num) {
            System.out.println("The given number is a Palindrome");
        } else {
            System.out.println("The given number is not a Palindrome");
        }
    }
}
