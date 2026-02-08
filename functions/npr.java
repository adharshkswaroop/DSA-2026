package functions;
import java.util.*;
public class npr {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r=sc.nextInt();
        
        int nfact=fact(n);
        int nmfact=fact(n-r);

        int npr=nfact/nmfact;
        System.out.println(n+"p"+r+"="+npr);
        
    }
    public static int fact(int x){
            int rv=1;
            for(int i=1;i<=x;i++){
                rv=rv*i;
            }
            return rv;
        }
}
