package edu.aks.calc;

import edu.aks.calc.builder.UtilBuilder;
import edu.aks.calc.operator.Add;
import edu.aks.calc.operator.Operator;
import edu.aks.calc.util.StringUtils;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class CommandUtil {

    StringUtils util = new StringUtils ();
    UtilBuilder builder = new UtilBuilder ();

    private void welcomeUser () {
        System.out.println ( "Welcome !!!!" );
        System.out.println ( "\n" );
        System.out.println ( "This calculator provides various functions to the user. Please read the documentation to understand the commands" );
    }

    public Integer showInterface () {
        Integer number = 0;
        try {
            welcomeUser ();

            BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
            System.out.println ( "Please choose operation based on your preference" );
            System.out.println ( "Available options are -" );
            System.out.println ( " Type 1 for Addition" );
            System.out.println ( " Type 2 for Subtraction" );
            System.out.println ( " Type 3 for Multiplication" );
            System.out.println ( " Type 4 for Division" );
            System.out.println ( " Type 5 for Modulus" );
            System.out.println ( "Type  6 to exit the utility" );
            String input = br.readLine ();
            try {
                number = Integer.parseInt ( input );
                if (6 == number) {
                    System.out.println ( "Thanks for visitng. We would like you to visit again !!!!" );
                    return 0;
                }
            } catch (NumberFormatException nfe) {
                System.out.println ( "Incorrect input : The input must be a number , no special symbol or alphabet allowed" );
                return 0;
            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
        return number;
    }


    public void operatorChoiceMenu ( Integer choice ) {
        Operator op;

        List<Double> numberList = new ArrayList<> ();
        try {
            BufferedReader br = new BufferedReader ( new InputStreamReader ( System.in ) );
            switch (choice) {
                case 1:
                    System.out.println ( "Please type the numbers you want to add separated by space" +
                            " and press enter to mention end of numbers" );
                    String numbersForOperation = br.readLine ();
                    List<Double> list = util.findNumbersForOperator ( numbersForOperation );
                    if (null == list || list.isEmpty ()) {
                        break;
                    }

                    op = new Add ( list );
                    Double result = builder.build ( op );
                    System.out.println ( "The summation of the numbers is " + result );
                    System.out.println ( "Do you want to perform some other operation" );
                    System.out.println ( "Please type Y or N" );
                    String suggestion = br.readLine ();
                    if (suggestion.equalsIgnoreCase ( "Y" )) {

                    }
                    break;

            }
        } catch (Exception e) {
            e.printStackTrace ();
        }
    }

}
