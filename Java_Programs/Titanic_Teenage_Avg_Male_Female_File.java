import java.util.*;
import java.io.*;

class Titanic_Teenage_Avg_Male_Female_File {
    public static void main(String[] args) {
        Float avgmale = 0.0F;
        Float avgfemale = 0.0F;
        int male = 0;
        int female = 0;
        try {
            File myObj = new File("titanic_data.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] str = data.split(",");
                if (str.length > 6) {
                    String gender = str[4].trim();
                    String age = str[5].trim();
                    if (age.equals("")) {
                    } else {
                        if (Double.parseDouble(age) <= 18.0) {
                            if (gender.toLowerCase().equals("male")) {
                                avgmale = avgmale + Float.parseFloat(age);
                                male++;
                            } else {
                                avgfemale = avgfemale + Float.parseFloat(age);
                                female++;
                            }
                        }
                    }
                }
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        System.out.println();
        System.out.println("Male : " + male);
        System.out.println("Average Male Age : " + (avgmale / male));
        System.out.println("Female : " + female);
        System.out.println("Average Female Age: " + (avgfemale / female));
    }
}

// Output
// Male : 71
// Average Male Age : 10.530563
// Female : 68
// Average Female Age: 10.911765