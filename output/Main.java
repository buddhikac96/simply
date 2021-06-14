import java.io.*;
import java.util.Arrays;
import java.util.ArrayList;
import java.lang.Math;  


public class Main {

     static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        ArrayList<Integer> b = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6)); 
        add(b); 
        int c = Math.pow(2,3); 
        System.out.println(c); 
        System.out.println(Math.pow(3,2)); 

    } 

    public static void add(ArrayList<Integer> a){
        for(Integer i:a) {
            System.out.println(i); 

        } 

    } 


}