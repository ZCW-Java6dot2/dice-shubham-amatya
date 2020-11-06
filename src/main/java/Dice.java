import java.util.Random;

public class Dice {

    private int numOfSides = 6;
    private int faceValue;



    public Dice(int numOfSides){
         numOfSides = numOfSides;

        Random randomNumGenerator = new Random();
        faceValue = randomNumGenerator.nextInt(numOfSides) + 1;
    }



    public void rollDice(){             //this method is going to roll the dice

        Random randomNumGenerator = new Random();
        faceValue = randomNumGenerator.nextInt(numOfSides) + 1;

                                        //roll dice method ended
    }

    public int getFaceValue(){   //You need a getFaceValue function because faceValue's access level
                                 // is set as private, so to get the value, you need a get method.

        return faceValue;
    }



}
