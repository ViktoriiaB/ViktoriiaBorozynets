package firstLesson;

import java.util.Scanner;

public class dataTypes {

    public static void main(String[] args)
    {
        System.out.println("The height: ");
        Scanner height = new Scanner(System.in);
        int number = height.nextInt();

        System.out.println("Amount of floors: ");
        Scanner count = new Scanner(System.in);
        int number2 = count.nextInt();

        System.out.println("The height building" + " " + number +"m" + " " + "and" + " " + number2 + " " +
                "" + "floors");

    }
}
