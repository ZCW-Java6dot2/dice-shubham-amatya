import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class Simulation {

    public static void startTheGame(){

        System.out.println("Welcome to the good ol' Dicey game! Let's get rollin'\n");

        Dice die1 = new Dice (6);
        Dice die2 = new Dice(6);

       System.out.println("The current value of the first die is: " + die1.getFaceValue());
        System.out.println("The value of the second die is: "+ die2.getFaceValue()+"\n");
        System.out.println("Roll again?? Type \"Yes\" or \"No\"");

        Scanner S = new Scanner(System.in);
        String userResponse = S.nextLine();

        if( userResponse.equalsIgnoreCase("Yes")){
            die1.rollDice();
            die2.rollDice();
            System.out.println("The value after rolling your 1st die is: " + die1.getFaceValue());
            System.out.println("The value after rolling your 2nd die is: " + die2.getFaceValue());
        } else{
            System.out.println("Exiting the application...beeeep!!");
        }




        die1.rollDice();




    }

    }



