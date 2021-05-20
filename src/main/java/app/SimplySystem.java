package app;

import errors.SimplyError;

import java.util.List;

public class SimplySystem {
    public static void exit(List<SimplyError> errorList){

        // Print Errors
        for(SimplyError error : errorList){
            System.out.println(error.getErrorMessage());
        }


        // Exit
        System.exit(0);
    }
}
