import org.w3c.dom.ls.LSOutput;
import java.util.Scanner;

public class Simulation {

    public static void startTheGame(){

        Dice die1 = new Dice (6);
        Dice die2 = new Dice(6);

        System.out.println("Welcome to the good ol' Dicey game! Let's get rollin'\n");

        Scanner Sc = new Scanner(System.in);
        System.out.println("Warm up Champ!! How many times would you like to toss the dice?");
        int tossInput = Sc.nextInt();
        die1.tosses(tossInput);
        die2.tosses(tossInput);

//        System.out.println("The current value of the first die is: " + die1.getFaceValue());
//        System.out.println("The value of the second die is: "+ die2.getFaceValue()+"\n");
        System.out.println("---");


        int counter = 1;

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

            System.out.println("Would you like to play the snake eye game? Type \"Yes\" or \"No\"");

            die1.rollDice();
            die2.rollDice();

            String userResponse2 = S.nextLine();
            if (userResponse2.equalsIgnoreCase("yes")){
                while (!(die1.getFaceValue()==1 && die2.getFaceValue()==1)){
                    counter++;
                    die1.rollDice();
                    die2.rollDice();

                }
                System.out.printf("\nIt took %d attempts to get snake eyes.\n", counter);
                System.out.println("You rolled well :D Good Day, Dicey Out!");
            }



        } else{
            System.out.println("Exiting the application...beeeep!!");
        }








}
    }





