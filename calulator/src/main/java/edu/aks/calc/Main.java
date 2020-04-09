package edu.aks.calc;

import edu.aks.calc.util.CommandUtil;
import lombok.extern.log4j.Log4j;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

@Log4j
public class Main {

    public static void main(String[] args) {
        log.info("Main method functionality started !!!!");
        try (InputStream input = Main.class.getClassLoader().getResourceAsStream("config.properties")) {
            Properties prop = new Properties();
            if (input == null) {
                System.out.println("Sorry, unable to find config.properties");
                return;
            }
            //load a properties file from class path, inside static method
            prop.load(input);

            //get the property value and print it out
            log.info("Environment from orperty file is as " + prop.getProperty("env"));
        } catch (IOException ex) {
            log.error("Exception is as ::", ex);
         //   ex.printStackTrace();
        }
        CommandUtil util = new CommandUtil();
        Integer userIp = util.showInterface();
        if (userIp == 0) {
            System.exit(0);
        } else {
            util.operatorChoiceMenu(userIp);
        }
        System.out.println("Thanks for visiting !!!");
    }
}
