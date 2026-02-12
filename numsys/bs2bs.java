package numsys;
import java.util.*;
public class bs2bs {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();  
        int b1=sc.nextInt();
        int val1=Base2Dec(n,b1);
        System.out.println(val1);
        int b2=sc.nextInt();   
        int val2=Dec2Base(val1,b2);
        System.out.println(val2);
    }
    public static int Base2Dec(int n, int b1){
        int rv=0;

        int p=1;
        while(n>0){
            int dig=n%10;
            n=n/10;
            rv+=dig*p;
            p=p*b1;
        }
        return rv;
    }
    public static int Dec2Base(int n, int b2){
        int rv=0;

        int p=1;
        while(n>0){
            int dig=n%b2;
            n=n/b2;
            rv+=dig*p;
            p=p*10;
        }
        return rv;
    }
}
