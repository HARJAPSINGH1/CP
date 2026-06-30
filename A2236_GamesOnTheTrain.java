import java.util.Scanner;

public class A2236_GamesOnTheTrain{

    public static void main(String[] args) {
        
        Scanner sc  = new Scanner(System.in);

        int t = sc.nextInt();

        for(int i = 0; i < t; i++) {

            int n = sc.nextInt();

            int min = Integer.MAX_VALUE;
            int max = Integer.MIN_VALUE;

            for(int j = 0; j < n; j++){

                int h = sc.nextInt();

                min = Math.min(min, h);
                max = Math.max(max, h);

            }

            System.out.println(max - min + 1);
        }

        sc.close();
    }
    
}
