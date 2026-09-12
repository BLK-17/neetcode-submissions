class Solution {
    public int findDuplicate(int[] nums) {
        int s = nums[0];
        int r = nums[0];

        
        while(true){
            s = nums[s];
            r = nums[nums[r]];

            if(s==r)    break;
        }
        s = nums[0];
        while(s!=r){
            s = nums[s];
            r = nums[r];
        }
        return s;
    }
}
