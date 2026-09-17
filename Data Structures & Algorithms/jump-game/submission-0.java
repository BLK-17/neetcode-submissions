class Solution {
    public boolean canJump(int[] nums) {
        int ft = 0;
        for(int i=0;i<nums.length;i++){
            if(i>ft){
                return false;
            }

            ft = Math.max(ft, i+nums[i]);

            if(ft>=nums.length-1) return true;
        }
        return true;
    }
}
