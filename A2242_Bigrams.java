import java.util.Scanner;

public class A2242_Bigrams {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while(t-- > 0) {

            int k = sc.nextInt();
            int maxCardCount = 0;
            int lettersWithAtleastTwoCards = 0;

            for(int i = 1; i <= k; i++) {

                int cardCount = sc.nextInt();
                if(cardCount > maxCardCount) {
                    maxCardCount = cardCount;
                }

                if(cardCount >= 2) {
                    lettersWithAtleastTwoCards++;
                }
                
            }

            if(lettersWithAtleastTwoCards >= 2 || maxCardCount >= 3) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }

        sc.close();
    }
    
}
