import java.util.*;
import java.io.*;

class Average_Temp_File {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Map<String, String> max = new HashMap<String, String>();
        Map<String, String> count = new HashMap<String, String>();
        String[] da = null;
        try {
            File myObj = new File("input.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                da = data.split(" ");
                if (max.containsKey(da[0])) {
                    int temp = Integer.parseInt(max.get(da[0]));
                    int avg = (temp + Integer.parseInt(da[1]));
                    max.put(da[0], String.valueOf(avg));
                    if (count.containsKey(da[0])) {
                        int sum = Integer.parseInt(count.get(da[0])) + 1;
                        count.put(da[0], String.valueOf(sum));
                    }
                } else {
                    max.put(da[0], da[1]);
                    count.put(da[0], "1");
                }
            }

            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println("Maximum Temp according to year");
        System.out.println("Printing Values");
        for (int k = 0; k < 1; k++) {
            Set<String> keys = max.keySet();
            for (String key : keys) {
                max.put(key, String.valueOf(
                        (Float.parseFloat(max.get(key)))
                                /
                                (Float.parseFloat(count.get(key)))));
                System.out.println(key + " || " + max.get(key));
            }
        }
        sc.close();
    }
}
// Output
// Gives the average temperature of respective year from input.txt file