import java.util.Random;

public class Dice {

    private int numOfSides;
    private int faceValue;





    public Dice(int numOfSides){
         numOfSides = numOfSides;

        Random randomNumGenerator = new Random();
        faceValue = randomNumGenerator.nextInt(numOfSides) + 1;
    }

    //this method is going to roll the dice

    public void rollDice(){

        Random randomNumGenerator = new Random();
        faceValue = randomNumGenerator.nextInt(numOfSides) + 1;

    //roll dice method ended
    }

    public int getFaceValue(){

        return faceValue;
    }



}
