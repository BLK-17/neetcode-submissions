class Solution {
    public boolean canReach(String s, int minJump, int maxJump) {
        int n = s.length();
        boolean[] dp = new boolean[n];
        dp[0] = true;
        int re = 0;
        for(int i=1;i<n;i++){
            if(i>=minJump){
                re += dp[i-minJump]?1:0;
               
            }
            if(i>maxJump)   re -= dp[i-maxJump-1]?1:0;
            dp[i] = re>0 && s.charAt(i) == '0';
        }
        return dp[n-1];
    }
}