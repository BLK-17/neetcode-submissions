class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] res = new int[n];

        int pf = 1;
        for(int i=0;i<n;i++){
            res[i] = pf;
            pf *= nums[i];
        }

        int sf = 1;
        for(int i=n-1;i>=0;i--){
            res[i] *= sf;
            sf *= nums[i];
        }
        return res;
    }
}  
