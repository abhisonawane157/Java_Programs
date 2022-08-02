import java.util.*;

class Password_Checker {
    public static int valid(char str[], int n) {
        int re = 0;
        if (n < 4) {
            return re;
        } else {
            int count = 0;
            for (int c = 0; c < n; c++) {
                if (str[c] >= '0' && str[c] <= '9') {
                    count++;
                }
            }
            for (int i = 0; i < n; i++) {
                if (!(str[i] == ' ' && str[i] == '/')) {
                    if (count > 1) {
                        if (str[i] >= 'A' && str[i] <= 'Z') {
                            if (!(str[0] >= '0' && str[0] <= '9')) {
                                re = 1;

                            } else {
                                re = 0;
                            }
                        }
                    }
                }
            }
        }
        return re;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Password: ");
        String str = sc.next();
        char[] n = new char[str.length()];
        for (int i = 0; i < str.length(); i++) {
            n[i] = str.charAt(i);
        }
        if (valid(n, str.length()) == 1) {
            System.out.println("Password Valid");
        } else {
            System.out.println("Password Invalid");
        }
        sc.close();
    }
}

// Output
// Enter Password: HelloWorld123
// Password Valid