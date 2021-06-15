package app;

import errors.SimplyError;
import syntaxerror.SyntaxError;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

public class SimplySystem {
    //Semantic errors
    public static void exit(SimplyError error){

        System.out.println(error.getErrorMessage());

        File output = new File("output");
        if(!output.exists()){
            System.out.println("Creating new folder : output");
            output.mkdir();
        }else{
            for(File f : output.listFiles()){
                f.delete();
            }
        }
        System.out.println("Writing Err");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("output/err.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        printWriter.print(error.getErrorMessage());
        printWriter.close();
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        System.out.println("Err.txt file created in location : output/err.txt\n\n");
        System.out.println("---------------------------------------------------");
        System.out.println("TRANSPILING FAILED DUE TO COMPILE ERRORS");
        System.out.println("---------------------------------------------------\n\n");
        System.exit(0);
    }

    // Syntax errors
    public static void exit(List<SyntaxError> errors){
        File output = new File("output");
        if(!output.exists()){
            System.out.println("Creating new folder : output");
            output.mkdir();
        }else{
            for(File f : output.listFiles()){
                f.delete();
            }
        }
        System.out.println("Writing Err");
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter("output/err.txt");
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        PrintWriter printWriter = new PrintWriter(fileWriter);
        for(var err : errors){
            printWriter.print(err.getLine() + ":" + err.getCharPositionInLine() + " -> " + err.getMessage());
        }
        printWriter.close();
        try {
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }
        System.out.println("Err.txt file created in location : output/err.txt\n\n");
        System.out.println("---------------------------------------------------");
        System.out.println("TRANSPILING FAILED DUE TO COMPILE ERRORS");
        System.out.println("---------------------------------------------------\n\n");
        System.exit(0);
    }
}
