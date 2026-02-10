import java.util.*;
public class span{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=s.nextInt();
        }
        
        System.out.println(Arrays.toString(arr));

        int max=arr[0];
        int min=arr[0];
        
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
            if(arr[i]<min){
                min=arr[i];
            }
        }
        int span=max-min;
        System.out.println(span);
    }
}