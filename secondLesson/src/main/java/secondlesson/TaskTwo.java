package secondlesson;

import java.util.Scanner;

public class TaskTwo {

    public static void main(String[] args) {
        Scanner answerFromTerminal = new Scanner(System.in);
        int count = 0;

        while (count < 3) {
            System.out.println("If I drink, I die. If I eat, I am fine. What am I?");
            String whatAmI = answerFromTerminal.nextLine();

            if (whatAmI.equals("Fire")) {
                System.out.println("Great");
                break;
            }
            else if (whatAmI.equals("I don't know")) {
                System.out.println("Answer:Fire");
                break;
            }
            else {
                System.out.println("Think again");
                count++;
            }
        }
    }
}

