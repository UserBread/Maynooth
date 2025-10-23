public class lab
{
    public static void main(String [] args) {

        // System.out.println(exercise1("0000"));
        // System.out.println(exercise1("0100"));
        // System.out.println(exercise1("1100"));
        // System.out.println(exercise2("0000"));
        // System.out.println(exercise2("0100"));
        // System.out.println(exercise2("1100"));
        System.out.println(exercise3("0000"));
        System.out.println(exercise3("01000"));
        System.out.println(exercise3("1100"));
    }

    public static boolean exercise1(String tape) {

        // Returns true if a string accepts with an even number of 0s, false otherwise

        int counter = 0;
        for (int i = 0; i < tape.length(); i++) {

            if (tape.charAt(i) == '0') {
                counter++;
            }
        }
        if (counter % 2 == 0 && counter != 0) return true;
        return false;
    }

    public static boolean exercise2(String tape) {
        // Returns true if a string accepts with an even number of 1s, false otherwise

        int counter = 0;
        for (int i = 0; i < tape.length(); i++) {

            if (tape.charAt(i) == '1') {
                counter++;
            }
        }
        if (counter % 2 == 0 && counter != 0) return true;
        return false;
    }

    public static boolean exercise3(String tape) {

        // Returns true if a string accepts with an even number of 1s or an even number of 0s, false otherwise
        if (exercise1(tape) || exercise2(tape)) return true;
        return false;
    }
}