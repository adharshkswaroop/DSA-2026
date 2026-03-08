package code150;
import java.util.*;
// public class Buystock {
//     public int maxProfit(int[] prices) {
//         int min=prices[0];
//         int maxProfit=0;
//         for(int i=0;i<prices.length;i++){
//             if(i<min)? min=i ;
//             int profit=price[i]-min;
//             maxProfit=Max(profit,maxProfit);
//         }
//     }
// }

public class Buystock {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] prices= new int[n];
        for(int i=0;i<n;i++){
            prices[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(prices));
        Buystock bs= new Buystock();
        System.out.println(bs.maxProfit(prices));
    }
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int maxProfit=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min) min=prices[i] ;
            int profit=prices[i]-min;
            if(profit>maxProfit) maxProfit=profit;
            
        }
        return maxProfit;
    }
}

