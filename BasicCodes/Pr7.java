public class Pr7 {
    
    public static void main(String[] args) {

        int num = 6, x = 1 , sum = 0;
        
        while (x < num) {
            if (num % x == 0) {
                sum = sum + x;
            }
            x++;
        }

        if(sum == num) {
            System.out.println(num + " is a Perfect Number");
        } else {
            System.out.println(num + " is not a Perfect Number");
        }
    }
}
