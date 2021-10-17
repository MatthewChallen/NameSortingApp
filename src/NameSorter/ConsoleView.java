package NameSorter;

//Handles user input/output
public class ConsoleView implements View{

    public void readError(){
        System.out.println("There was an error reading the file. Please check the file name and format. Press enter to exit");
    }

    public void writeError(){
        System.out.println("There was an error writing to the file. Press enter to exit");
    }

    public void success(){
        System.out.println("The operation has successfully occurred. Press enter to exit");
    }
}
