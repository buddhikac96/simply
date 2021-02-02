package ast.util;

import ast.util.enums.AssignmentOperator;

import java.util.HashMap;

public class AssignmentOperatorMapper {

    static HashMap<String, AssignmentOperator> operatorHashMap;

    static {
        operatorHashMap = new HashMap<>();
        operatorHashMap.put("=", AssignmentOperator.Assign);
        operatorHashMap.put("+=", AssignmentOperator.Add_Assign);
        operatorHashMap.put("-=", AssignmentOperator.Sub_Assign);
        operatorHashMap.put("*=", AssignmentOperator.Mul_Assign);
        operatorHashMap.put("/=", AssignmentOperator.Div_Assign);
    }

    public static AssignmentOperator getAssignmentOperator(String operator){
        return operatorHashMap.get(operator);
    }

}
