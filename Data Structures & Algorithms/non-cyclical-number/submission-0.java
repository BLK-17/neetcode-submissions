class Solution {
    public boolean isHappy(int n) {
        Set<Integer> sn = new HashSet<>();
        while(n!= 1){
            if(sn.contains(n)){
                return false;
            }
            sn.add(n);
            int sum = 0;
            while(n>0){
                int d = n%10;
                sum += d * d;
                n/=10;
            }
            n = sum;
        }
        return true;
    }
}
