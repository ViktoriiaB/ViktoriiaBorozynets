package taskExceptions;

import java.util.Scanner;

public class LoginPage {
    Scanner scanner = new Scanner(System.in);

    String password = scanner.next();
    String login = scanner.next();
    String confirmPassword = scanner.next();

    public static boolean loginForm(String login, String password, String confirmPassword)
            throws WrongLoginException, WrongPasswordException {

        try {
            int count = 0;
            for (int a = 0; a < login.length(); a++) {
                if (!Character.isLetterOrDigit(login.charAt(a))) {
                    throw new WrongLoginException();
                }
            }

            int count1 = 0;
            for (int b = 0; b < password.length(); b++) {
                if (!Character.isLetterOrDigit(password.charAt(b))) {
                    throw new WrongPasswordException();
                }
            }

            int count2 = 0;
            for (int c = 0; c < confirmPassword.length(); c++) {
                if (!Character.isLetterOrDigit(confirmPassword.charAt(c))) {
                    throw new WrongPasswordException();
                }
            }

        } catch (WrongPasswordException | WrongLoginException exception) {
            System.out.println("Wrong login or password!");
            return false;
        }
        System.out.println("All requirements for password have been met");
        return true;

    }
}
