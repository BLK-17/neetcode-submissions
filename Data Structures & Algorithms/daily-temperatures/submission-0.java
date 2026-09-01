class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n = temperatures.length;
        int[] ans = new int[n];
        Stack<Integer> st  = new Stack<>();
        for(int i=0;i<n;i++){
            while(!st.isEmpty() && temperatures[i] > temperatures[st.peek()]){
                int pr = st.pop();

                ans[pr] = i - pr;
            }
            st.push(i);
        }
        return ans;
    }
}
