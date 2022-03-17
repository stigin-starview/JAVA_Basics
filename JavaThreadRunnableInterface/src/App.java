// Using Runtime interface 

public class App {
    public static void main(String[] args) throws Exception {
        SampleThread t1 = new SampleThread();
        SampleThread t2 = new SampleThread();
        SampleThread t3 = new SampleThread();
        Thread d1 = new Thread(t1);
        Thread d2 = new Thread(t2);
        Thread d3 = new Thread(t3);

        d1.start();
        d2.start();
        d3.start();
    }
}
