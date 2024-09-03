import java.util.Scanner;

public class CharacterFrequency {

    /***
     * Question: Character frequency in a String
     * Owner name: Ayush Ray
     * Date: 3-9-2024
     */
    public static void stringFollowedByNumber() {
        String input;
        System.out.println(Constant.ENTER_FREQ_STRING);
        Scanner sc = new Scanner(System.in);
        input = sc.next();

        String output = "";
        int i = 0;

        if (!input.equals(input.toLowerCase())) {
            System.out.println(Constant.LOWER_WARN);
        } else {

            while (i < input.length()) {
                char character = input.charAt(i);
                int count = 0;

                while (i < input.length() && input.charAt(i) == character) {
                    count++;
                    i++;
                }

                output += character;
                output += count;
            }
            System.out.println(output);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
                    stringFollowedByNumber();
        sc.close();
    }
}
