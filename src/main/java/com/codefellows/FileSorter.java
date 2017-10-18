package com.codefellows;

import com.google.code.externalsorting.ExternalSort;
import java.io.File;
import java.io.IOException;

public class FileSorter extends ExternalSort{

    private String inputFile;
    private String outputFile;

    public FileSorter(String inputFile, String outputFile) {
        super();
        this.inputFile = inputFile;
        this.outputFile = outputFile;
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
