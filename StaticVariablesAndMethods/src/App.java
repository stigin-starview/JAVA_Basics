public class App {
    public static void main(String[] args) throws Exception {
        Testing num1 = new Testing();
        Testing num2 = new Testing();

        num1.a = 12;
        num1.b = 15;
        num2.a = 100;
        num2.b = 200;
        System.out.println("num1.a: "+num1.a +"\nnum2.a"+ num2.a + "\nnum1.b"+num1.b+"\nnum1.b"+ num2.b+ "\nnum1.b"+num1.z+ "\nnum2.b"+num2.z);
        num1.z = 1234;

        System.out.println("Changed the value on variable num1.z \nnum1.z"+num1.z+ "\nnum2.z"+num2.z);

    }
}