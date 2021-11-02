package secondlesson;

public class taskOne {

    public static void main(String[] args) {
        int[] myArray = new int[]{15, 8, 24, 41, 9, 84};
        int randomNumber = (int)(Math.random() * myArray.length);
        System.out.println(myArray[randomNumber]);
        switch(myArray[randomNumber]) {
            case 8:
                System.out.println("I am lucky");
                break;
            case 24:
                System.out.println("I am lucky");
                break;
            case 84:
                System.out.println("I am lucky");
                break;
            default:
                System.out.println("Run again");
        }

    }
}




