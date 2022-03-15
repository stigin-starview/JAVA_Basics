import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a Number: ");
        int num = sc.nextInt();
        
        if(num%2 == 1) {
            System.out.println("Entered number is a Prime number");
        }
        else {
            System.out.println("Entered number is not a prime number");
        }

    }
}
