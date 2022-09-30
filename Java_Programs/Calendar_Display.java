public class Calendar_Display {

    static void calendar(String s) {
        String[] day = { "Su", "Mo", "Tu", "We", "Th", "Fr", "Sa" };
        int datNum = 0;
        for (int i = 0; i < day.length; i++)
            if (s.substring(0, 2).equals(day[i])) {
                datNum = i;
                break;
            }
        String[][] mat = new String[7][6];
        for (int i = 0; i < 7; i++) {
            mat[i][0] = day[i];
        }
        int count = 1;
        for (int i = 1; i < 6; i++) {
            for (int j = 0; j < 7; j++) {
                if (datNum == j) {
                    mat[j][i] = "" + count;
                    // if (datNum++ == 6)
                    // datNum = 0;
                    // else
                    datNum = Integer.MAX_VALUE;
                    count++;
                    // datNum++;
                } else {
                    if (datNum == Integer.MAX_VALUE) {
                        mat[j][i] = count + "";
                        count++;
                    }
                }
            }
        }
        for (int i = 0; i < mat.length; i++) {
            for (int j = 0; j < mat[i].length; j++) {
                if (mat[i][j] == null)
                    mat[i][j] = "";
            }
        }
        display(mat);
    }

    static void display(String[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        String s = "Thursday";
        calendar(s);
    }
}
