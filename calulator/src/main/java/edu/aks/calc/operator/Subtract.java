package edu.aks.calc.operator;

import java.util.List;

public class Subtract implements Operator{

    private List<Double> numberList;

    public Subtract ( List<Double> list ) {
        this.numberList = list;
    }


    public Double operate () {
        Double difference = 0.0;
        if (null != numberList && !numberList.isEmpty ()) {

            difference = numberList.get ( 0 );
            numberList.remove ( 0 );
            for (Double no : numberList) {
                difference = difference - no;
            }
        }
        return difference;
    }
}
