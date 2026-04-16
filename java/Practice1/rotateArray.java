package Practice1;

import java.util.Arrays;

public class rotateArray {

    // https://www.youtube.com/watch?v=oABQlhrhXzg&ab_channel=TAPACADEMY
    public static void main(String[] args) {
        int[] nums = {-1,-100,3,99}; //[3,99,-1,-100]
        int n = nums.length;
        int k =2;
        k = k%n;
        if(k<0){
            k = k+n;
        }
      
        rotate(nums,0,n-k-1);
        rotate(nums, n-k,n-1);
        rotate(nums, 0, n-1);
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate(int[] nums,int start,int end)
    {
           while (start<end) {
             int temp = nums[start];
             nums[start] = nums[end];
             nums[end] = temp;
             start++;
             end--;
           }
    }
}
