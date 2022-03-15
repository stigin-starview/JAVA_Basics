import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Sum input = new Sum();


        System.out.println("\nEnter 2 numbers\n");
        System.out.print("Enter number 1: ");
        input.a = sc.nextInt();
        System.out.print("Enter number 2: ");
        input.b = sc.nextInt();
        input.AddValue();
        input.DisplayValue();
    }
}
