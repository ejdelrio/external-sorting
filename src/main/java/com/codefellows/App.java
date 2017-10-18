package com.codefellows;

import com.google.code.externalsorting.ExternalSort;
import java.io.File;
import com.codefellows.FileSorter;

/**
 * Hello world!
 *
 */
public class App
{

    public static void main( String[] args )
    {
        FileSorter fs = new FileSorter(
                "/Users/Eddie/codefellows/501/external-sorting/src/main/resources/test.txt",
                "/Users/Eddie/codefellows/501/external-sorting/src/main/resources/result.txt"
        );

        fs.sortTestFile();
    }
}
