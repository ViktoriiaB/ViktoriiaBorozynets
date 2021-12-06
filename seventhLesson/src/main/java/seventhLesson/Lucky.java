package seventhLesson;

import java.util.Random;

public class Lucky {

    public static boolean checkInteger (int []myArray, int index) throws WrongTypeException, LengthTypeException, NegativeValueException, CustomLengthException {

        if (myArray == null)
            throw new WrongTypeException();

        if (index > myArray.length)
            throw new LengthTypeException();

        if (index < 0)
            throw new NegativeValueException();

        if (myArray.length == 5)
        throw new CustomLengthException();


        int indexRandom = myArray[index];

        if (indexRandom % 2 == 0) {
            System.out.println("I am lucky!");
            return true;
        }
        else {
            System.out.println("Run again");
            return false;
        }
    }
}
//    int[] myArray = {15, 8, 24, 41, 9, 84};