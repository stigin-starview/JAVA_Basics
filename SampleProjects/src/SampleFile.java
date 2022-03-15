import java.util.Scanner;

public class SampleFile {
    public static void main(String ar[]) {

        Scanner s= new Scanner(System.in);
        System.out.println("Enter 2 number");

        int  a = s.nextInt();
        int b = s.nextInt();
        int c = a + b;

        System.out.println("Sum of the 2 numbers are: "+c);
        
    }
}
