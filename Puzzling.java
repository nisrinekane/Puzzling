import java.util.Arrays;
import java.util.Collections;

public class Puzzling {
    public static void main(String[] args) throws Exception {
        JavaPuzzles puzzle = new JavaPuzzles();

        //random number
        System.out.println(Arrays.toString(JavaPuzzles.getTenRolls()));

        //random letter
        System.out.println(JavaPuzzles.getRandomLetter());

        //password
        System.out.println(JavaPuzzles.generatePassword());

        //set new password
        System.out.println(JavaPuzzles.getNewPasswordSet(8));
    }
}