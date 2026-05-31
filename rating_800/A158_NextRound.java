import java.util.*;

public class A158_NextRound {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        int n = sc.nextInt();
        int k = sc.nextInt();
        int list[] = new int[n];

        for(int i = 0; i < n; i++){

            list[i] = sc.nextInt();
        }

        int kth = list[k - 1];

        int count = 0;

        for(int i = 0; i < n; i++){
            
            if(list[i] >= kth && list[i] > 0){
                count++;
            }
        }

        System.out.println(count);

        sc.close();

    }
    
}
