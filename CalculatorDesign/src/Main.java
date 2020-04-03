import edu.aks.calc.CommandUtil;

public class Main {

    public static void main ( String[] args ) {

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
