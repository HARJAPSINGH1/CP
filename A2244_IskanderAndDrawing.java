import java.util.Scanner;

public class A2244_IskanderAndDrawing {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {

            int n = sc.nextInt();
            String s = sc.next();

            int ans = 0;
            int len = 0;

            for (int i = 0; i < n; i++) {

                if (s.charAt(i) == '#') {
                    len++;
                } else {
                    ans = Math.max(ans, (len + 1) / 2);
                    len = 0;
                }
            }

            // Check the last line (if the string ends with '#')
            ans = Math.max(ans, (len + 1) / 2);

            System.out.println(ans);
        }

        sc.close();
    }
}