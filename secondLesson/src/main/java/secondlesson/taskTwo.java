package secondlesson;

import java.util.Scanner;

public class taskTwo {

    public static void main(String[] args) {
        System.out.println("If I drink, I die. If I eat, I am fine. What am I");
        Scanner answerFromTerminal = new Scanner(System.in);
        String whatAmI = answerFromTerminal.nextLine();

        if (whatAmI.equals("Fire")) {
            System.out.println("Great!");
        } else if (whatAmI.equals("I don't know")) {
            System.out.println("Answer:Fire");
        } else {
            System.out.println("Think again");
        }
    }
}

