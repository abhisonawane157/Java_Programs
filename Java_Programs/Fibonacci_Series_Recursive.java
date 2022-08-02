import java.util.*;

class Fibonacci_Series_Recursive {
  static int n1 = 0, n2 = 1, n3 = 0;

  static void pfibo(int count) {
    if (count > 0) {
      n3 = n1 + n2;
      n1 = n2;
      n2 = n3;
      System.out.print(" " + n3);
      pfibo(count - 1);
    }
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number: ");
    int n = sc.nextInt();
    System.out.print(n1 + " " + n2);
    pfibo(n - 2);
    sc.close();
  }
}

// Output
// Enter Number: 10
// 0 1 1 2 3 5 8 13 21 34