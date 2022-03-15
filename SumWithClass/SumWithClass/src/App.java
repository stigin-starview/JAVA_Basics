import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Sum input = new Sum();


        System.out.println("\nEnter 2 numbers\n");
        System.out.print("Enter number 1: ");
        int num1 = sc.nextInt();
        System.out.print("Enter number 2: ");
        int num2 = sc.nextInt();
        input.AddValue(num1, num2);
        input.DisplayValue();
    }
}
