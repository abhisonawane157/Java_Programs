import java.util.*;

class Remove_Chars_Using_Second_In_First {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter 1st String: ");
        String str1 = sc.next();
        System.out.print("Enter 2nd String: ");
        String str2 = sc.next();
        String sub = "";

        Map<Integer, String> map = new HashMap<Integer, String>();
        for (int i = 0; i < str2.length(); i++) {
            map.put(i, String.valueOf(str2.charAt(i)));
        }
        for (int j = 0; j < str1.length(); j++) {
            if (map.containsValue(String.valueOf(str1.charAt(j)))) {
            } else {
                sub = sub + str1.charAt(j);
            }
        }
        // System.out.println("List: "+map);
        // System.out.println("Str 1: "+str1);
        // System.out.println("Str 2: "+str2);
        System.out.println("After removing same characters: " + sub);
        sc.close();
    }
}

// Output
// Enter 1st String: HelloWorld
// Enter 2nd String: old
// After removing same characters: HeWr