class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder();
        int i = a.length() - 1;
        int j = b.length()-1;
        int cr = 0;
        while(i>=0||j>=0||cr>0){
            int s = cr;
            if(i>=0){
                s += a.charAt(i) - '0';
                i--;
            }
            if(j>=0){
                s += b.charAt(j) - '0';
                j--;
            }
            res.append(s%2);
            cr = s/2;
        }
        return res.reverse().toString();
    }
}