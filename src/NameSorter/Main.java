package NameSorter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String fileName = args[0];
        NameFileHandler handler;
        View consoleView = new ConsoleView();

        try{
            handler = new NameFileHandler(fileName);
        } catch (IOException e) {
            consoleView.readError();
            return;
        }

        handler.sortNames();

        try{
            handler.saveFile();
        } catch (IOException e) {
            consoleView.writeError();
            return;
        }

        consoleView.success();
    }
}
