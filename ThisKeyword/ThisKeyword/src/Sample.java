public class Sample {
    int a, b;
    int x = 5000, y=10;

    Sample(int a, int b) {
        this.a = a;
        this.b = b;
        System.out.println("a = " +a+ "\nb = " +b+ "\nx = " +x+ "\ny = " +y);
        System.out.println("\nchanging the global variables:");
        x = a;
        y= b;
        System.out.println("\n Now x is assigned to a and y is assigned to b \na = " +a+ "\nb = " +b+ "\nx = " +x+ "\ny = " +y);
    }

    void Testing() {
        System.out.println("testing the global variable:\n a ="+a+"\n b="+b+ "\nx = " +x+ "\ny = " +y);
    }
    
}
