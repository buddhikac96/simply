/*
    Not useful
 */

package passes.semantic.utils;

import errors.models.SimplyFunction;

import java.util.HashSet;

public class SemanticUtilities {
    public static HashSet<SimplyFunction> simplyFunctions = new HashSet<>();

    public static boolean isFunctionExist(SimplyFunction function){
        if(simplyFunctions.contains(function)) {
            return true;
        }else{
            return false;
        }
    }
}
