import java.util.*;
import java.lang.*;

public class CC_Card_Removal {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int [] arr = new int[n];
            for (int j = 0; j<n; j++){
                arr[j] = sc.nextInt();
            }
            int count = 0;
            int temp = 0;
            Arrays.sort(arr);
            for(int j = 0; j<arr.length-1; j++){
                
                if(arr[j] == arr[j+1]){
                    count++;
                }
                else{
                    count = 0;
                }
                temp = Math.max(temp, count);
            }
            System.out.println(n-temp-1);
        }
    }
}
