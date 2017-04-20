/**
 * Created by Vladisson on 20.04.2017.
 */
public class SimpleDotCom {
    int [] locationCells;
    int numOfHits = 0;

    public void setLocationCells (int [] locs){
        locationCells = locs;
    }

    public String checkYourself (String stringGuess) {
        int guess = Integer.parseInt(stringGuess);
        String result = "Мимо";
        for (int cell : locationCells) {
            if ( guess == cell) {
                result = "Попал";
                numOfHits++;
                break;
            }
        }// выходим из цикла
        if (numOfHits == locationCells.length){
            result = "Потопил";

        }
        System.out.println(result);
        return result;
    } //завершаем метод

}// завершаем класс
