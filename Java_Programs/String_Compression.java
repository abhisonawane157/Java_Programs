import java.util.*;

class String_Compression {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        HashMap<String, Integer> maps = new HashMap<String, Integer>();
        String[] cha = new String[str.length()];
        cha = str.split("");
        for (int i = 0; i < cha.length; i++) {
            int count = 0;
            if (maps.containsKey(" " + cha[i])) {
                maps.put(" " + cha[i], 1 + maps.get(" " + cha[i]));
            } else if (maps.containsKey(cha[i])) {
                if (!(cha[i].equals(cha[i - 1])) && i > 0) {
                    maps.put(" " + cha[i], 1);
                } else {
                    count = 1 + maps.get(cha[i]);
                    maps.put(cha[i], count);
                }
            } else {
                maps.put(cha[i], 1);
            }
        }
        String updated = "";
        for (String key : maps.keySet()) {
            // System.out.print(key + "" + maps.get(key));
            updated = updated + "" + key + "" + maps.get(key);
        }
        System.out.println();
        System.out.println();
        if (str.length() > updated.length()) {
            System.out.println("String Accepted");
            System.out.println("Inputted String: " + str);
            System.out.println("Compressed String: " + updated);
        } else {
            System.out.println("String Rejected");
            System.out.println("Inputted String: " + str);
            System.out.println("Compressed String: " + updated);
        }
        sc.close();
    }
}

// Output
// Enter a string: aaabbbcccdefff
// a3b3c3d1e1f3

// String Accepted
// Inputted String: aaabbbcccdefff
// Compressed String: a3b3c3d1e1f3