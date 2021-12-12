package secondlesson;

import java.util.Random;

public class Task {

    public static void main(String[] args) {
        Random random = new Random();
        int[] myArray = {15, 8, 24, 41, 9, 84};
        int randomNumber = random.nextInt(myArray.length);

        if (randomNumber % 2 == 0) {
            System.out.println("I am lucky!");
        } else {
            System.out.println("Run again");
        }

    }
}

