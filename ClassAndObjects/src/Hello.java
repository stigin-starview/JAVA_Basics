public class Hello {
    public static void main(String[] args) throws Exception {
        
        //Creating objects by calling class
        TestingClass TClass1 = new TestingClass();
        TestingClass TClass2 = new TestingClass();
        TClass1.a = 10;
        TClass1.b = 20;
        TClass2.a = 30;
        TClass2.b = 69;

        System.out.println("testing class\n"+TClass1.a+"\n"+TClass1.b+"\n"+TClass2.a+"\n"+TClass2.b);

        TClass1.Sum();
        TClass2.Sum();

    

    }
}
