import java.util.Arrays;
import java.util.Random;
import java.util.Collections;


public class JavaPuzzles {

    //random numbers array
    public static int[] getTenRolls() {
        int [] arr = new int[10];
        Random rand = new Random();
        for (int i = 0; i < arr.length; i++) {
            arr[i] = rand.nextInt(20) + 1;
        }
        return arr;
    }

    //random letters
    public static char getRandomLetter() {
        char[] letters = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Random rand = new Random();
        int randIndex = rand.nextInt(25);
        return letters[randIndex];
    }

    //generate password but with number too
    public static String generatePassword() {
        String password = "";
        Random rand = new Random();
        for (int i = 0; i < 5; i++) {
            password = password + getRandomLetter() +  rand.nextInt(100);
        }
        return password;
    }

    //long password
    public static String getNewPasswordSet(int value) {
        String password = "";
        for (int i = 0; i < value; i++) {
            password += getRandomLetter();
        }
        return password;
    }
}