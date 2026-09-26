class CountSquares {
    private Map<Integer, Map<Integer, Integer>> map;
    public CountSquares() {
        map = new HashMap<>();
    }
    
    public void add(int[] point) {
        int x = point[0];
        int y = point[1];
        map.putIfAbsent(x, new HashMap<>());

        Map<Integer, Integer> yMap = map.get(x);
        yMap.put(y, yMap.getOrDefault(y, 0)+1);
    }
    
    public int count(int[] point) {
        int x = point[0];
        int y = point[1];
        int ans = 0;

        if(!map.containsKey(x)){return 0;}

        for(int py:map.get(x).keySet()){
            if(py == y){ continue;}
            int d = Math.abs(py-y);
            int frq = map.get(x).get(py);
            ans += frq*get(x+d, y) * get(x+d, py);

            ans += frq*get(x-d,y)*get(x-d,py);
        }
    return ans;
    }
    private int get(int x, int y){
        if(!map.containsKey(x)){ return 0;}
        return map.get(x).getOrDefault(y, 0);
    }
}

