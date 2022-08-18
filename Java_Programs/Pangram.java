import java.util.*;

public class Pangram {
    public static void pangram(String str) {
        for (char i = 'a'; i <= 'z'; i++) {
            if (!str.contains(String.valueOf(i))) {
                System.out.println(str + " is not a Pangram");
                System.exit(1);
            }
        }
        System.out.println(str + " is a Pangram");
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a String ");
        String str = sc.nextLine();
        pangram(str);
        sc.close();
    }
}
