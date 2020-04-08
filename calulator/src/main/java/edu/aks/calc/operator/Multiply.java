package edu.aks.calc.operator;

import java.util.List;

public class Multiply implements Operator {

    private List<Double> numberList;

    public Multiply ( List<Double> list ) {
        this.numberList = list;
    }

    public Double operate () {
        Double product = 0.0;
        if (null != numberList && !numberList.isEmpty ()) {
            product = numberList.get ( 0 );
            numberList.remove ( 0 );
            for (Double no : numberList) {
                product = product * no;
            }
        }
        return product;
    }
}
