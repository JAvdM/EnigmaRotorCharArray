public class NewRotor {

    private String rotorCode;
    private String rotorType;

    public NewRotor(String rotorType, String rotorCode) {
        this.rotorCode = rotorCode;
        this.rotorType = rotorType;

        String[] rotorInputSplit = rotorCode.split("");

        System.out.print("char[] ");
        System.out.print(rotorType + " = {");

        for (int i = 0; i < 25; i++) {
            System.out.print("'" + rotorInputSplit[i] + "', ");
        }

        System.out.print("'" + rotorInputSplit[25] + "'};");

    }
}