class Solution {
    public int maxArea(int[] heights) {
        int lt = 0, rt = heights.length-1;
        int res = 0;

        while(lt<rt){
            int wt = Math.min(heights[lt],heights[rt])*(rt-lt);
            res = Math.max(res, wt);
            if(heights[lt]<=heights[rt])    lt++;
            else rt--;
        }
        return res;
    }
}
