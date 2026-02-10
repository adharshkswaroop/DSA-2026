import java.util.*;
public class findarr{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));

        int tar=sc.nextInt();
        int idx=-1;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==tar){
                idx=i;
                break;
            }
            // // MISTAKE I DONE
            // else{
            //     System.out.println("not found");
            //     break;
            // }
        }
        System.out.println("index: "+ idx);
        
    }
}