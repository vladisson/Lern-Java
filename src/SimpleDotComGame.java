/**
 * Created by Vladisson on 20.04.2017.
 */
public class SimpleDotComGame {
    public static void main(String[] args) {
        int numOfGuesses = 0;
        GameHelper helper = new GameHelper();

        SimpleDotCom theDotCom = new SimpleDotCom();
        int randomNum = (int) Math.random()*5;
        int[] location = {randomNum, randomNum + 1, randomNum + 2};
        theDotCom.setLocationCells(location);
        boolean isActive = true;

        while (isActive == true){

            String guess = helper.getUserInput("Введите число");
            String result = theDotCom.checkYourself(guess);
            numOfGuesses++;
            if (result.equals("Потопил")) {
                isActive = false;
                System.out.println("Вам потребовалось " + numOfGuesses + " попвток(и)");


            }
        }

    }
}
