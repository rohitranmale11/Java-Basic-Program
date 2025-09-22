import java.util.Scanner;

public class Pr8 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Number");
        int num = sc.nextInt();

        int n1 = 0 , n2 = 1;

        for(int i = 0; i <num; i++) {
                System.out.print(n1 + " ");

                int n3 = n1 + n2;
                n1 = n2;
                n2 = n3;
        }
    }
}
