public class App extends PrinterErrors{
    void LowOnPaper(String report) {
        System.out.println(report);
    }
    App() {
        PrinterProgram test = new PrinterProgram(this); /* when passing "this" you can passing App class and printererrors 
                                                            is part of it so you are passing that too. 
                                                            PrinterProgram is expecting to get printerErros as obj 
                                                            but as it is Abstract class you can't create a object directly" */
        test.PrinterMessage();
    }
    public static void main(String[] args) throws Exception {
        // PrinterProgram test = new PrinterProgram(this); --- we can't use this , because its a global variable command as main is static it won't allow it.
        App test = new App();
        
    }

}
