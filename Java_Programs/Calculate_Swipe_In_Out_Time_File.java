import java.text.SimpleDateFormat;
import java.time.*;
import java.text.*;
import java.util.*;
import java.io.*;

class Calculate_Swipe_In_Out_Time_File {
    public static void main(String[] args) throws Exception {
        File file = new File("data.txt");
        String date = "";
        BufferedReader br = new BufferedReader(new FileReader(file));
        String st = "";
        long dura;
        HashMap<String, String> duration = new HashMap<String, String>();
        HashMap<String, String> out = new HashMap<String, String>();
        HashMap<String, String> in = new HashMap<String, String>();
        while ((st = br.readLine()) != null) {
            String[] data = st.split("\\*\\*\\*");
            String id = data[0];
            date = data[1];
            String time = data[2];
            String status = data[3];
            if (status.equals("10001")) {
                if (in.containsKey(id)) {
                    int timee = Integer.parseInt(in.get(id));
                    if (timee < Integer.parseInt(time)) {
                    } else {
                        in.put(id, time);
                    }
                } else {
                    in.put(id, time);
                }
            } else if (status.equals("10101")) {
                if (out.containsKey(id)) {
                    int timee = Integer.parseInt(out.get(id));
                    if (timee > Integer.parseInt(time)) {
                    } else {
                        out.put(id, time);
                    }
                } else {
                    out.put(id, time);
                }
            } else {
            }
            String totaltime = "";
            if (in.containsKey(id) && out.containsKey(id)) {
                String tim = (in.get(id));
                String tom = (out.get(id));
                String[] timein = tim.split("(?<=\\G.{2})");
                String[] timeout = tom.split("(?<=\\G.{2})");

                try {
                    DateFormat dateFormat = new SimpleDateFormat("HH:mm:ss");
                    dateFormat.setTimeZone(TimeZone.getTimeZone("UTC"));
                    Date datein = dateFormat.parse(timein[0] + ":" + timein[1] + ":" + timein[2]);
                    Date dateout = dateFormat.parse(timeout[0] + ":" + timeout[1] + ":" + timeout[2]);

                    long secondsin = datein.getTime() / 1000L;
                    long secondsout = dateout.getTime() / 1000L;
                    dura = secondsout - secondsin;
                    LocalTime timeOfDay = LocalTime.ofSecondOfDay(dura);
                    totaltime = timeOfDay.toString();
                    duration.put(id, totaltime);
                } catch (Exception ex) {

                }
            }
        }

        for (String key : duration.keySet()) {
            System.out.println("" + key + " || " + date + " || " + duration.get(key));
        }
        for (String keyin : in.keySet()) {
            if (out.containsKey(keyin)) {
            } else {
                System.out.println(keyin + ", no swipe out found.");
            }
        }
        for (String keyout : out.keySet()) {
            if (in.containsKey(keyout)) {
            } else {
                System.out.println(keyout + ", no swipe in found.");
            }
        }
        br.close();
    }
}

// data.text
// 00990003***02062008***090501***10001
// 00990002***02062008***082850***10001
// 00990001***02062008***190750***10101
// 00990003***02062008***190007***10101
// 00990003***02062008***085850***10001
// 00990001***02062008***083850***10001
// 00990002***02062008***083851***10001
// 00990001***02062008***190050***10101
// 00990001***02062008***082850***10001

// Output
// 00990001 || 02062008 || 10:39
// 00990003 || 02062008 || 10:01:17
// 00990002, no swipe out found.

// Explanation
// Format of data: ID***Date***Time***IN/OUT
// Calculate the timing after IN and before OUT, if no OUT is found then print
// no swipe out found.