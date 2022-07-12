package pageObjects;

import java.util.Random;

public class ApplicationPage {

    public String getRandomNumberString() {
        // It will generate 6 digit random Number.
        // from 0 to 999999
        Random rnd = new Random();
        int number = rnd.nextInt(999999999);
        // this will convert any number sequence into 6 character.
        return "0" + String.format("%06d", number);
    }
}
