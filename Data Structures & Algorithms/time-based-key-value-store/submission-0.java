class TimeMap {
HashMap<String, ArrayList<int[]>> mp;
HashMap<String, ArrayList<String>> vl;
    public TimeMap() {
        mp = new HashMap<>();
        vl = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        if(!mp.containsKey(key)){
            mp.put(key, new ArrayList<>());
            vl.put(key, new ArrayList<>());
        }
        mp.get(key).add(new int[]{timestamp});
        vl.get(key).add(value);       
    }
    
    public String get(String key, int timestamp) {
        if(!mp.containsKey(key)){
            return "";
        }

   ArrayList<int[]> list = mp.get(key);
        ArrayList<String> vals = vl.get(key);

        int left = 0;
        int right = list.size() - 1;

        String ans = "";

        while (left <= right) {

            int mid = left + (right - left) / 2;

            if (list.get(mid)[0] <= timestamp) {
                ans = vals.get(mid);
                left = mid + 1;
            } 
            else {
                right = mid - 1;
            }
        }

        return ans;
    }
}
