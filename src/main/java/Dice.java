import java.util.Random;
import java.util.Scanner;

public class Dice {



   private int numOfSidesForDice ;
   private int faceValue;
  //private int saveNumOfTosses;




    public Dice(int numOfSides){
         //this is a constructor which takes the no. of sides from simulation.java and passes it to rollDice()
        numOfSidesForDice = numOfSides;
    }



    public void rollDice(){             //this method is going to roll the dice

        Random randomNumGenerator = new Random();
        faceValue = randomNumGenerator.nextInt(numOfSidesForDice) + 1;
        Bins B = new Bins();
        B.storeValues(faceValue);
                                        //roll dice method ended
    }

    public int getFaceValue(){   //You need a getFaceValue function because faceValue's access level
                                 // is set as private, so to get the value, you need a get method.

        return faceValue;
    }

public void tosses(int numOfTosses){

        Bins bintoStoreValue = new Bins();

    for (int i = 1; i <= numOfTosses; i++) {
        rollDice();
        bintoStoreValue.storeValues(faceValue);
      //  System.out.println("Result: " + faceValue );

    }
}

}
