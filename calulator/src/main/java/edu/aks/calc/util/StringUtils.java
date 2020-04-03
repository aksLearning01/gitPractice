package edu.aks.calc.util;

import java.util.ArrayList;
import java.util.List;

public class StringUtils {

    public List<Double> findNumbersForOperator ( String input ) {
        List<Double> list = new ArrayList<> ();
        input = input.trim().replaceAll("\\s{2,}", " ");
        String[] inputs = input.split ( " " );
        try {
            for (String ind : inputs) {
                Double inputForOperator = Double.parseDouble ( ind );
                list.add ( inputForOperator );
            }
        } catch (NumberFormatException nfe) {
            System.out.println ( "Only numebrs accpeted for operation, no special character or alphabet accepted" +
                    "\n  Please provide correct inputs " );
            return null;
        }
        return list;
    }
}
