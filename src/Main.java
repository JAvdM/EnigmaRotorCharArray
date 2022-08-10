import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String rotorUserCode;
        NewRotor userMadeRotor;
        char[] alphabet = {'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'};

        System.out.println("What is the rotor type in camelCase format?");
        String rotorUserType = scanner.nextLine();

        while(true) {

            System.out.println("What is the rotor code string?");
            rotorUserCode = scanner.nextLine();

            if (rotorUserCode.length() > 26 || rotorUserCode.length() < 26) {
                System.out.println("Please insert exactly 26 characters!");
                rotorUserCode = scanner.nextLine();
            } else if (rotorUserCode.length() == 26) {
                userMadeRotor = new NewRotor(rotorUserType, rotorUserCode);
                break;
            }
        }
    }
}