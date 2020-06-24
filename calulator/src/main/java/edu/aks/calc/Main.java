package edu.aks.calc;

public class Main {

    public static void main(String[] args) {

        //Added to test merge conflict functionality
        Sum sum = new Sum();
        System.out.println(sum.add(2, 4));

        //Will try to change the method to test the merge conflict functionality
        Difference diff = new Difference();
        System.out.println(diff.subtract(3, 9));


    }
}
