import java.util.*;

public class A231_Team {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int count = 0;

        for(int j = 0; j < n; j++){

            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            if((a + b + c) >= 2){
                count += 1;
            }
        }

        System.out.println(count);

        sc.close();
    }
}
