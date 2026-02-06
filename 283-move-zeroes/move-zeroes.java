class Solution {
    public void moveZeroes(int[] nums) {
        int z = 0,nz = 0;
        while(nz < nums.length){
            if(nums[nz] != 0){
                int temp = nums[nz];
                nums[nz] = nums[z];
                nums[z] = temp;
                z++;
            }
            nz++;
        }
    }
}