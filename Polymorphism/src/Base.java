public class Base {
    Base() {
        System.out.print("\nThis is a constructor in the base class: \n");
    }
    Base(int a) {
        System.out.print("\nThis is a Argument constructor in the base class \n"+a);
    }

    int a;

    void Display() {
        System.out.println("This is the base calling!! ");
    }
    
}
