import java.util.Scanner;

public class B2241_GoodTimes {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();

        int t = sc.nextInt();

        while(t-- > 0) {

            String x = sc.next();
            int len = x.length();

            long y = 1l;

            for(int i = 0; i < len; i++) {
                y *= 10;
            }

            y += 1;

            sb.append(y).append('\n');
        }

        System.out.println(sb);

        sc.close();
    }
    
}
