import java.util.Scanner;

public class A71_WayTooLongWords {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

            String word = sc.next();
            int m = word.length();

            if (m > 10) {
                String str = "" + word.charAt(0) + (m - 2) + word.charAt(m - 1);
                System.out.println(str);
            } else {
                System.out.println(word);
            }
        }

        sc.close();
    }
}