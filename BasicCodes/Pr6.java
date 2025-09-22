import java.util.Scanner;

public class Pr6 {
    public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the Number");
        int num = sc.nextInt();

        for (int i = 1; i<=num; i++) {
            if(i % 2 == 0) {
                System.out.println(i + " is Even Number");
            } else {
                System.out.println(i * i + " is Odd Number Square");
            }
        }
    }
}
