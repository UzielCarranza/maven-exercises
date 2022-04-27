import org.apache.commons.lang3.StringUtils;

import java.util.Scanner;

import static org.apache.commons.lang3.StringUtils.swapCase;

public class main {
    public static void main(String[] args) {
        main();
    }

    public static void main() {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter something");
        String input = sc.nextLine();
        System.out.println("you entered: " + input);

        if (
                StringUtils.isNumeric(input)) {
            System.out.println(input + "its numeric");
        } else {
            System.out.println(input + " is not a number");
            System.out.println(" Reverse: + " + StringUtils.reverse(input));
            System.out.println("Flipped case : " + StringUtils.reverse(swapCase(input)));
        }
    }
}
