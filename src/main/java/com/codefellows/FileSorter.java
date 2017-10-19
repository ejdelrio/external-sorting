package com.codefellows;

import com.google.code.externalsorting.ExternalSort;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;

public class FileSorter extends ExternalSort{

    private String inputFile;
    private String outputFile;

    @FunctionalInterface
    public interface Compare {
        Comparator<String> op(String a, String b);
    }




    public FileSorter(String inputFile, String outputFile) {
        super();
        this.inputFile = inputFile;
        this.outputFile = outputFile;

        this.defaultcomparator = (String a, String b) -> a.compareTo(b);


    }

    public void sortTestFile() {

        try {
            sort(
                    new File(inputFile),
                    new File(outputFile)
            );
        } catch(IOException e) {
            e.getStackTrace();
        }
    }








}
