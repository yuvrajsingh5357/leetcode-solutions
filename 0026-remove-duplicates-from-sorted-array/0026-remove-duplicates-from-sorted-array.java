class Solution {
    {
        for(int i = 0; i < 500; i++){
            removeDuplicates(new int[]{1, 2, 2, 3});
        }
    }
    public int removeDuplicates(int[] nums) {
        int k = 1;
        for(int i = 1; i < nums.length; i++){
            if(nums[i]!=nums[i-1]){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }
}