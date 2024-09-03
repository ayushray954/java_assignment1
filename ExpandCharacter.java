/***
 * Question:  Character Frequency in a String.
 * Owner name: Ayush Ray.
 * Date: 3-9-2024
 */
import java.util.Scanner;

public class ExpandCharacter {
    public static boolean checkUppercaseString(String input) {
        for (char ch : input.toCharArray()) {
            if (Character.isUpperCase(ch)) {
                return true;
            }
        }
        return false;
    }

    public static void expandCharacter() {

        Scanner sc = new Scanner(System.in);

        int key;
        String input;


                    System.out.println(Constant.ENTER_STRING);
                    input = sc.next();

                    if (checkUppercaseString(input)) {
                        System.out.println(Constant.LOWERCASE_WARNING);
                    } else {
                        int i = 0;
                        String output = "";

                        while (i < input.length()) {
                            char character = input.charAt(i);
                            i++;

                            if (i < input.length() && Character.isDigit(input.charAt(i))) {

                                String number = "";
                                while (i < input.length() && Character.isDigit(input.charAt(i))) {
                                    number += input.charAt(i);
                                    i++;
                                }

                                int count = Integer.parseInt(number);

                                for (int j = 0; j < count; j++) {
                                    output += character;
                                }
                            } else {
                                output += character;
                            }
                        }
                        System.out.println(output);
        }
        sc.close();

    }

    public static void main(String[] args) {
        expandCharacter();
    }
}
