import java.util.*;

class Print_Max_Occurence_Vowels_Array {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter size of array: ");
        int size = sc.nextInt();
        // String[] strname = new String[size];
        HashMap<String, Integer> strname = new HashMap<String, Integer>();

        int temp = 0;
        String max = "";
        for (int i = 0; i < size; i++) {
            strname.put(sc.next(), 1);
        }
        int count = 0;
        for (String key : strname.keySet()) {

            String kee = key.toLowerCase();
            for (int i = 0; i < kee.length(); i++) {
                String ke = String.valueOf(kee.charAt(i));
                if ((ke.contains("a") || ke.contains("e") || ke.contains("i") || ke.contains("o") || ke.contains("u"))
                        || (ke.contains("A") || ke.contains("E") || ke.contains("I") || ke.contains("O")
                                || ke.contains("U"))) {
                    count++;
                }
            }
            strname.put(kee, count);
            if (temp < count) {
                max = key;
                temp = count;
            }
            count = 0;
        }
        System.out.println("Maximum vowels occured in: " + max);
        // System.out.println(strname);
        sc.close();
    }
}

// Output
// Enter size of array: 3
// helloworld
// hi
// byeworld
// Maximum vowels occured in: helloworld