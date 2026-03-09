package code150;
import java.util.*;;
public class binarysearch {
    public static void main(String[] args) {
        int[] nums={-1,0,3,4,5,9,12};
        int target=12;
        binarysearch bs=new binarysearch();
        
        System.out.println(bs.search(nums, target));
    }
    private int binarySearch(int l, int r, int[] nums, int target) {
        if (l > r) return -1;

        int m = l + (r - l) / 2;
        if (nums[m] > target) {
            return binarySearch(l, m - 1, nums, target);
        } else if (nums[m] < target) {
            return binarySearch(m + 1, r, nums, target);
        } else {
            return m;
        }
    }
    public int search(int[] nums, int target) {
        return binarySearch(0, nums.length - 1, nums, target);
    }
}
