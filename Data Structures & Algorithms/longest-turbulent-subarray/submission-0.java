class Solution {
    public int maxTurbulenceSize(int[] arr) {
        int in = 1, dc = 1, ans = 1;
        for(int i=1;i<arr.length;i++){
            if(arr[i] > arr[i-1]){
                in = dc + 1;
                dc = 1;
            } 
            else if(arr[i] < arr[i-1]){
                dc = in + 1;
                in = 1;
            }
            else{
                in = 1;
                dc = 1;
            }
            ans = Math.max(ans, Math.max(in, dc));
        }
        return ans;
    }
}