class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int ttl = 0, tc =  0, tk = 0, st = 0;
        for(int i=0;i<gas.length;i++){
            ttl += gas[i];
            tc += cost[i];

            tk += gas[i] - cost[i];
            if(tk < 0){
                st = i+1;
                tk = 0;
            }
        }
        return ttl < tc ? -1 : st;
    }
}
