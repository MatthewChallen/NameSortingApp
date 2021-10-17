package NameSorter;

import java.util.List;

//Handles user input/output
public class ConsoleView implements View{

    public void readError(){
        System.out.println("There was an error reading the file. Please check the file name and format. Press enter to exit");
    }

    public void writeError(){
        System.out.println("There was an error writing to the file. Press enter to exit");
    }

    public void presentNames(List<String> names){
        for(String name : names){
            System.out.println(name);
        }
    }

    public void success(String saveFileName){
        System.out.printf("Finished: created %s%n", saveFileName);
    }
}
