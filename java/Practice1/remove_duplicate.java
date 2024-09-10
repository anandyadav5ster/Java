public class remove_duplicate {
    
    public static void main(String[] args) {
        int[] nums = {2,2,3,4,5,6};
        int rd = removeduplicate(nums);
        for(int i =0;i<rd;i++){
            System.out.print(nums[i]+" ");
        }
    }

    public static int removeduplicate(int[] nums){

        int rd = 0;

        for(int i=1;i<nums.length;i++){
            if(nums[rd]!=nums[i]){
                rd++;
                nums[rd] = nums[i];
            }
        }
        return rd+1;
    }
}
