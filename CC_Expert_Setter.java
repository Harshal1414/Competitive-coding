import java.util.Scanner;

public class CC_Expert_Setter {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        for(int i = 0; i<t; i++){
            int x = sc.nextInt();
            int y = sc.nextInt();
            float xp = x/2f;
            if(y>=xp){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
