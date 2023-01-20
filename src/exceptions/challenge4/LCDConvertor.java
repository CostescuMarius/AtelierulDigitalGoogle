package exceptions.challenge4;

public class LCDConvertor {
    public static void main(String[] args) {
        int number = 0;
        printLCD(number);
    }

    public static void printLCD(int number) {
        String num = Integer.toString(number);
        String[][] LCD = {
                {" - ", "   ", " - ", " - ", "   ", " - ", " - ", " - ", " - ", " - "},
                {"| |", "  |", "  |", "  |", "| |", "|  ", "|  ", "  |", "| |", "| |"},
                {"   ", "   ", " - ", " - ", " - ", " - ", " - ", "  |", "| |", "| |"},
                {" - ", "   ", " - ", " - ", "   ", " - ", " - ", "  |", " - ", " - "},
                {"| |", "  |", "  |", "  |", "| |", "  |", "| |", "  |", "| |", "  |"},
                {" - ", "   ", " - ", " - ", "   ", " - ", " - ", "  |", " - ", " - "}
        };
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < num.length(); j++) {
                int digit = Character.getNumericValue(num.charAt(j));
                System.out.print(LCD[i][digit]);
                if (j < num.length() - 1)
                    System.out.print(" ");
            }
            System.out.println();
        }
    }
}
