package secondlesson;

import java.util.Scanner;

public class taskTwoOne {

    public static void main(String[] args) {
        System.out.println("If I drink, I die. If I eat, I am fine. What am I?");
        Scanner answerFromTerminal = new Scanner(System.in);
        String whatAmI = answerFromTerminal.nextLine();


        switch (whatAmI) {
            case "Fire":
                System.out.println("Great!");
                break;
            case "I don't know":
                System.out.println("Answer:Fire!");
                break;
            default:
                System.out.println("Think again");
            }

        }
    }

