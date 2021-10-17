package NameSorter;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class NameFileHandler {

    private String fileName;
    private ArrayList<Name> names = new ArrayList<>();

    public NameFileHandler(String fileName) throws IOException {
        if(!fileName.endsWith(".txt")){
            throw new IOException("File must be a text file");
        }
        this.fileName = fileName;
        this.loadFile();
    }

    private void loadFile() throws IOException {

        //load file
        BufferedReader reader = new BufferedReader(new FileReader(this.fileName));

        //Load data to arraylist
        String fileLine = reader.readLine();
        while(fileLine != null){
            names.add(new Name(fileLine));
            fileLine = reader.readLine();
        }

        //Close the stream
        reader.close();
    }

    public void sortNames(){
        Collections.sort(this.names);
    }

    public void saveFile() throws IOException {

        //Append sorted to fileName
        String sortedFileName = fileName.replaceFirst(".txt", "-sorted.txt");

        BufferedWriter writer = new BufferedWriter(new FileWriter(sortedFileName));

        boolean firstLine = true;
        for(Name name : names){

            if(!firstLine){
                writer.write('\n');
            }
            writer.write(name.getNameString());
            firstLine = false;
        }

        writer.close();
    }
}
