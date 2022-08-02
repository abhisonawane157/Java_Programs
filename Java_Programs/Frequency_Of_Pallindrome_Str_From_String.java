import java.util.*;

class Frequency_Of_Pallindrome_Str_From_String {
  public static int fPalIn(String str, int j, int k) {
    int count = 0;
    for (; j >= 0 && k < str.length(); --j, ++k) {
      if (str.charAt(j) != str.charAt(k)) {
        break;
      }
      System.out.print(str.substring(j, k + 1) + ", ");
      count++;
    }
    return count;
  }

  public static int fAllPal(String str) {
    int count = 0;
    System.out.print("Pallindrome Substrings are: ");
    for (int i = 0; i < str.length(); ++i) {
      count += fPalIn(str, i - 1, i + 1);
      count += fPalIn(str, i, i + 1);
    }

    return count;
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter String: ");
    String str = sc.next();
    int count = fAllPal(str);
    System.out.println();
    System.out.println("Total palindrome substrings: " + count);
    sc.close();
  }
}

// Output
// Enter String: helloworld
// Pallindrome Substrings are: ll, owo,
// Total palindrome substrings: 2