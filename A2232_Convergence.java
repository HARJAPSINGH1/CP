import java.util.*;

public class A2232_Convergence {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0){
            
            int n = sc.nextInt();
            int a[] = new int[n];

            for(int i = 0; i < n; i++){
                a[i] = sc.nextInt();
            }

            Arrays.sort(a);

            int median = a[n/2];
            int smaller = 0;
            int greater = 0;

            for(int x : a){
                if(x < median) smaller++;
                else if(x > median) greater++;
            }

            System.out.println(Math.max(smaller, greater));
        }

        sc.close();

    }
    
}

