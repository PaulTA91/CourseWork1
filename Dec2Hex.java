class Dec2Hex {

    public static int Arg1;

    public static void main(String[] args) {

        try {
            if (!validateInput(args[0])) {
                System.out.println("Input invalid. Must be a positive integer."); //returns an error on no argument but build completes
            }
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("No input Detected, try again.");
        }


    }

    public static boolean validateInput(String input) {
        boolean valid;

        try {
            if (input.length() == 0) {
                System.out.print("No input detected. Try Again.\n");
            }
        } catch (NumberFormatException e) {
            valid = false;
        }

        try {
            Arg1 = Integer.parseInt(input);
            valid = true;
            if (Arg1 <= 0) {
                System.out.println("Value must be a positive Int");
            } else {
                convertInput(input);
            }
        } catch (NumberFormatException e) {
            valid = false;
        }

        return valid;
    }


    public static void convertInput(String arg) {
        char ch[] = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};
        int rem, num;
        num = Arg1;
        String hexadecimal = "";
        System.out.println("Converting the Decimal Value " + num + " to Hex...");

        while (num != 0) {
            rem = num % 16;
            hexadecimal = ch[rem] + hexadecimal;
            num = num / 16;
        }

        System.out.println("Hexadecimal representation is: " + hexadecimal);
        System.out.println("Ending Program");
    }

}
