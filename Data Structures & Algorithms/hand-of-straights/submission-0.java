class Solution {
    public boolean isNStraightHand(int[] hand, int groupSize) {
        if(hand.length % groupSize != 0){
            return false;
        }

        TreeMap<Integer, Integer> mp = new TreeMap<>();
        for(int c : hand){
            mp.put(c, mp.getOrDefault(c,0)+1);
        }
        while(!mp.isEmpty()){
            int f = mp.firstKey();

            for(int i=0;i<groupSize;i++){
                int c = f + i;
            
            if(!mp.containsKey(c)){
                return false;
            }

            int cnt = mp.get(c);

            if(cnt == 1){ mp.remove(c);}
            else{ mp.put(c, cnt-1);}
        }
    }
        return true;
}
}