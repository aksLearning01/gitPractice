package edu.aks.calc.builder;

import edu.aks.calc.operator.Operator;

public class UtilBuilder {

    public Double build ( Operator op ) {
        return op.operate ();
    }
}
