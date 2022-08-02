
import java.util.*;

public class Autobiographical_Number {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        String num = sc.next();
        int count = 0;
        boolean flag = false;
        for (int i = 0; i < num.length(); i++) {
            count = 0;
            for (int j = 0; j < num.length(); j++) {
                if (i == Integer.parseInt(String.valueOf(num.charAt(j)))) {
                    count++;
                }
            }
            if (count == Integer.parseInt(String.valueOf(num.charAt(i)))) {
                flag = true;
            } else {
                flag = false;
                break;
            }
        }
        if (flag)
            System.out.println(num + " is an Autobiographical Number.");
        else
            System.out.println(num + " is not an Autobiographical Number.");
        sc.close();
    }
}

// Output
// 1210
// 1210 is an Autobiographical Number
// 1211
// 1211 is not an Autobiographical Number