package edu.aks.calc;


import edu.aks.calc.util.CommandUtil;
import lombok.extern.log4j.Log4j;

@Log4j
public class Main{

   // private static Logger logger = LoggerFactory.getLogger(Main.class);


    public static void main ( String[] args ) {
        log.info("Main method functionality started !!!!");
        CommandUtil util = new CommandUtil ();
        Integer userIp = util.showInterface ();
        if (userIp == 0) {
            System.exit ( 0 );
        } else {
            util.operatorChoiceMenu ( userIp );
        }
        System.out.println ( "Thanks for visiting !!!" );
    }
}
