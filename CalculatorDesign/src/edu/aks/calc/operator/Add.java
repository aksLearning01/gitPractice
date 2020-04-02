package edu.aks.calc.operator;

import java.util.List;

public class Add implements Operator {

    private List<Double> numberList;

    public Add ( List<Double> list ) {
        this.numberList = list;
    }


    public Double operate () {
        Double sum = 0.0;
        if (null != numberList && !numberList.isEmpty ()) {
            for (Double no : numberList) {
                sum = sum + no;
            }
        }
        return sum;
    }
}

