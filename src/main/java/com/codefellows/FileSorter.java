package com.codefellows;

import com.google.code.externalsorting.ExternalSort;
import java.io.File;
import java.io.IOException;
import java.util.Comparator;

public class FileSorter extends ExternalSort{

    private String inputFile;
    private String outputFile;
    private Comparator<String> customCompart = (String a, String b) -> a.compareTo(b);

    public FileSorter() {
        super();
        this.inputFile = "/Users/Eddie/codefellows/501/external-sorting/src/main/resources/test.txt";
        this.outputFile = "/Users/Eddie/codefellows/501/external-sorting/src/main/resources/result.txt";

        this.defaultcomparator = customCompart;
    }


    public FileSorter(String inputFile, String outputFile) {
        super();
        this.inputFile = inputFile;
        this.outputFile = outputFile;

        this.defaultcomparator = customCompart;


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
