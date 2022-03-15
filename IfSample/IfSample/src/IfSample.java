import java.util.Scanner;

public class IfSample {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number to see if its negative or positive: ");
        int a = s.nextInt();

        if(a >= 0) {
            System.out.println("The number is positive! ");
        }
        else {
            System.out.println("The number is negative! ");
        }
    }
}
