package NameSorter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        NameFileHandler handler;
        View consoleView = new ConsoleView();

        if(args.length == 0){
            //No file name provided
            consoleView.readError();
            return;
        }

        String saveFileName;
        String fileName = args[0];

        try{
            handler = new NameFileHandler(fileName);
        } catch (IOException e) {
            consoleView.readError();
            return;
        }

        consoleView.presentNames(handler.sortNames());

        try{
            saveFileName = handler.saveFile();
        } catch (IOException e) {
            consoleView.writeError();
            return;
        }

        consoleView.success(saveFileName);
    }
}
