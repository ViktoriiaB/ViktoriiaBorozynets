package secondlesson;

import java.util.Random;

public class TaskOne {

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










////        int randomNumber = (int)(Math.random() * myArray.length);
////        System.out.println(myArray[randomNumber]);



//        for (int i = 0; i < myArray.length; i++) {
//            myArray[i] = random.nextInt(84);
//            if (myArray[i] % 2 == 0) {
//                System.out.print(myArray[i] + " I am lucky ");
//            }
//
////        switch(myArray[randomNumber]) {
////            case 8:
////                System.out.println("I am lucky");
////                break;
////            case 24:
////                System.out.println("I am lucky");
////                break;
////            case 84:
////                System.out.println("I am lucky");
////                break;
////            default:
////                System.out.println("Run again");
////        }
//
//        }
//    }
//}
