import java.util.*;
public class dif2arr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] a1=new int[n];
        for(int i=0;i<a1.length;i++){
            a1[i]=sc.nextInt();
        }

        int m=sc.nextInt();
        int[] a2=new int[m];
        for(int i=0;i<a2.length;i++){
            a2[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(a1));
        System.out.println(Arrays.toString(a2));
        
        int[] dif=new int[n>m? n:m];
        int b=0;

        int i=a1.length-1;
        int j=a2.length-1;
        int k=dif.length-1;
        while(k>=0){
            int d=b;
            if(i>=0){
                d-=a1[i];
            }
            if(j>=0){
                d-=a2[j];
            }
            b=d/10;
            d=d%10;
            dif[k]=d;
            i--;j--;k--;
        }
        if(b!=0){
            System.out.print(b);
        }
        for(int val:dif){
            System.out.print(val);
             
        }
        
    }
}
