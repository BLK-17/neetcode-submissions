class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()) return false;

        int[] s1cnt = new int[26];
        int[] wincnt = new int[26];

        for(char c : s1.toCharArray()){
            s1cnt[c-'a']++;
        }

        int lt = 0;

        for(int r = 0;r<s2.length();r++){
            wincnt[s2.charAt(r)-'a']++;
            if(r-lt+1>s1.length()){

            wincnt[s2.charAt(lt)-'a']--;
            lt++;
            }

        if(r-lt + 1 == s1.length()){
            if(Arrays.equals(s1cnt, wincnt)){
                return true;
            }
        }
        }
        return false;
    }
}
