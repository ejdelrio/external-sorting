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
    interface LambdaTest {
        void operation(String s);
    }


    public static void testLamda(String s, LambdaTest op) {
        op.operation(s);
    }

    public static void main( String[] args )
    {
        LambdaTest printString = (String s) -> {
            System.out.println(s);
        };

        LambdaTest printCapString = (String s) -> {
            System.out.println(s.toUpperCase());
        };


        FileSorter fs = new FileSorter();

        fs.sortTestFile();

        testLamda("test", printCapString);

    }
}
