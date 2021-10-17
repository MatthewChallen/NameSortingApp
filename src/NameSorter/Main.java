package NameSorter;

import java.io.IOException;

public class Main {

    public static void main(String[] args) {

        String fileName = args[0];
        NameFileHandler handler;
        View console = new ConsoleView();

        try{
            handler = new NameFileHandler(fileName);
        } catch (IOException e) {
            console.readError();
            return;
        }

        handler.sortNames();

        try{
            handler.saveFile();
        } catch (IOException e) {
            console.writeError();
            return;
        }

        console.success();

    }
}
