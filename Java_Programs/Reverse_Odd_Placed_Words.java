import java.util.*;

class Reverse_Odd_Placed_Words {
    public static void main(String[] args) {
        System.out.print("Enter String: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String[] words = str.split(" ");
        for (int i = 0; i < words.length; i++) {
            String w = "";
            if (i % 2 != 0) {
                w = words[i];
                String rev = "";
                for (int j = w.length() - 1; j >= 0; j--) {
                    rev = rev + w.charAt(j);
                }
                words[i] = rev;
            }
        }
        for (int i = 0; i < words.length; i++) {
            System.out.print(words[i] + " ");
        }
        sc.close();
    }
}

// Output
// Enter String: The world is incomplete without you.
// The dlrow is etelpmocni without .uoy