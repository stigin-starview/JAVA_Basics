public class PrinterProgram {

    PrinterErrors obj;

    PrinterProgram(PrinterErrors obj) {
        this.obj = obj;
    }

    void PrinterMessage() {

        // Below is the mock of codes that will be working to find the erro messages on the printer
        /*
        sending request to print to ....
        printer connected....
        checking printer status...
        receving printer erros....
        sending back error message
        */
        String errormessage = " printer is not working ";
        obj.LowOnPaper(errormessage);
        
    }




}
