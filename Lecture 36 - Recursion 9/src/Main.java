import java.util.*;

public class Main {
    static void combination(String dig, String[] kp, String res) {
        if (dig.length() == 0) {
            System.out.print(res + " ");
            return;
        }
        int currNum = dig.charAt(0) - '0';
        String currChoices = kp[currNum];
        for (int j = 0; j < currChoices.length(); j++) {
            combination(dig.substring(1), kp, res + currChoices.charAt(j));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String[] keypad = {"", "", "abc", "def", "ghi", "jkl", "mno", "pqr", "stuv", "wxyz"};
        combination(s, keypad, "");
    }
}
