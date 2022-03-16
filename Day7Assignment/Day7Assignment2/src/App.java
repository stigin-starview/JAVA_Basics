import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Calculations Calc = new Calculations();

        System.out.println("What operation do you wanna perform: \n For + Press 1\n For - Press 2\n For * Press 3\n For / Press 4 \nEnter: ");
        int operation = sc.nextInt();
        System.out.println("Enter 2 numbers: \n");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calc.num1 = a;
        Calc.num2 = b;
        int num = 0;
        switch(operation) {
            case 1:
            num = Calc.Add();
            break;

            case 2:
            num =Calc.Sub();
            break;

            case 3:
            num =Calc.Mult();
            break;

            case 4:
            num =Calc.Div();
            break;
        }
        System.out.println("Result: "+ num);
    }
}
