public class ValidNumberCommandLine {
    public static void main(String args[]) {
        int validCount = 0;
        int invalidCount = 0;

        for (String arg : args) {
            try {
                int number = Integer.parseInt(arg);
                validCount++;
            } catch (NumberFormatException e) {
                invalidCount++;
            }
        }

        System.out.println("Valid count = " + validCount);
        System.out.println("Invalid count = " + invalidCount);
    }
}