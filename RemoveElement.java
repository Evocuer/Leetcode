class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0; // 1st pointer
        int k = nums.length - 1; // 2nd pointer
        while (i < nums.length && i != k) {
            if (nums[i] == val) {
                swap(nums, i, k--);
            } else {
                i++;
            }
        }
        return k + 1;
    }

    public void swap(int[] nums, int i, int k) {
        int numaux = nums[i];
        nums[i] = nums[k];
        nums[k] = numaux;
    }
}
