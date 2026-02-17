package code150;
import java.util.*;
public class dup_no {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> hs = new HashSet<>();
            for (int num : nums) {
                if (hs.contains(num)) {
                    return true;
                }
            hs.add(num);
            }
            // MISTAKE
            // Adjacent loop: "NOT NEEDED" coz, HashSet<> already checks the duplicacy

            // for (int i = 0; i < nums.length - 1; i++) {
            //     if (nums[i] == nums[i + 1]) {
            //     return true;
            //     }
            // }
        return false;

    }
     public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int num[]=new int[n];
        for(int i=0;i<num.length;i++){
            num[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(num));
        
        dup_no obj = new dup_no();
        System.out.println(obj.hasDuplicate(num));
    }
}

