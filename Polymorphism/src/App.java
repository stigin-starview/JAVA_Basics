public class App extends Base {
    App() {
        System.out.println("\n this constructor is in the sub calss \n");
    }

    App(int a) {
        super(a);
        System.out.println("\n This is a argument constructor in the sub class");
    }

    int a;

    void Display() {
        
        System.out.println(" this is the sample...");
        super.a = 9999;
        System.out.println("This is the value from base class:  a = "+super.a+"\nMessage: ");
        super.Display();
    }

    public static void main(String[] args) throws Exception {
 
        App cl = new App(34);
        cl.a = 45;
        // System.out.println("This is the sub class: a = "+cl.a+"message: ");
        // cl.Display();

    }
} 