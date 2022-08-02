import java.util.*;
import java.io.*;

class Number_To_Binary_File {
    public static int Bin(int num) {
        int bin[] = new int[100];
        int i = 0;
        while (num != 0) {
            bin[i] = num % 2;
            num = num / 2;
            i++;
        }
        int nu = 0;
        for (int j = i - 1; j >= 0; j--) {
            System.out.print(bin[j]);
        }
        return nu;
    }

    public static void main(String[] args) {
        try {
            File myObj = new File("dummy_data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] str = data.split(" ");
                String yrs = str[0];
                String temp = str[1];
                System.out.print(data + " || ");
                System.out.print(Bin(Integer.parseInt(yrs)));
                System.out.print(" ");
                System.out.println(Bin(Integer.parseInt(temp)));
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}

// data
// 1900 39
// 1901 14
// 1910 5
// 1920 11
// 1902 20
// 1903 20
// 1930 22

// Output
// 1900 39 || 111011011000 1001110
// 1901 14 || 111011011010 11100
// 1910 5 || 111011101100 1010
// 1920 11 || 111100000000 10110
// 1902 20 || 111011011100 101000
// 1903 20 || 111011011110 101000
// 1930 22 || 111100010100 101100