package com.company;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws FileNotFoundException {
        File file = new File("textFile");
        Scanner scan = new Scanner(file);

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (line.length() > 15 && !line.startsWith("docNum") && !line.startsWith("contract")) {
                System.out.println(line + " correct");
            } else {
                System.out.println(line + " not correct");
            }
        }
            scan.close();
    }
    }





