public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, this is the main function lets begin!\n");

        OutClass cl = new OutClass();

        System.out.println("varaibles from the base class: \n base: "+cl.base+"i: "+cl.i+"j: "+cl.j+"basics: "+cl.basics);
        System.out.println("varaibles from the out class: \n\n\n out: "+cl.out+"Text: "+cl.text);

        cl.Basics();
        cl.Hello();

    }
}
