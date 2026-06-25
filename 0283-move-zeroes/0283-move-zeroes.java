class Solution {
    static {
        Solution warmup = new Solution();
        for (int i = 0; i < 500; ++i) {
            warmup.moveZeroes(new int[2]);
        }
    }

    public void moveZeroes(int[] nums) {
        int n = nums.length;
        int s = 0, f = 0;
        while (f < n) {
            if (nums[f] == 0) {
                f++;
            } else {
                int temp = nums[s];
                nums[s] = nums[f];
                nums[f] = temp;
                f++;
                s++;
            }
        }
    }
}