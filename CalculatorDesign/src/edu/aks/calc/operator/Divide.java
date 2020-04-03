package edu.aks.calc.operator;

import java.util.List;

public class Divide implements Operator {

    private List<Double> numberList;

    public Divide ( List<Double> list ) {
        this.numberList = list;
    }

    public Double operate () {
        Double division = 0.0;
        if (null != numberList && !numberList.isEmpty ()) {
            division = numberList.get ( 0 );
            numberList.remove ( 0 );
            for (Double no : numberList) {

                if (no == 0.0) {
                    System.out.println ( "Divide by zero is not allowed" );
                    return null;
                }
                division = division / no;
            }
        }
        return division;
    }
}
