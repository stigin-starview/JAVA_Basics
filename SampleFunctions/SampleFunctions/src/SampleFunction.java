import java.util.Scanner;

public class SampleFunction {
    
    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);  
        
        System.out.println("Enter 2 numbers: ");

        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = Sum(num1,num2);

        System.out.println("result: "+sum);

    }

    static int Sum(int a, int b) {
        int sum = a+b;
        return(sum);
    }
}
