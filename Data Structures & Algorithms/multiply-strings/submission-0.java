class Solution {
    public String multiply(String num1, String num2) {
        if(num1.equals("0") || num2.equals("0"))  return "0";

        int n = num1.length();
        int m = num2.length();

        int[] res = new int[n+m];

        for(int i=n-1;i>=0;i--){
            int d1 = num1.charAt(i)-'0';
            for(int j=m-1;j>=0;j--){
                int d2 = num2.charAt(j)-'0';

                int pd = d1*d2;

                int pos1 = i+j;
                int pos2 = i+j+1;

                int sum = pd+res[pos2];

                res[pos2] = sum%10;
                res[pos1] += sum/10;
            }
        }
        StringBuilder sb = new StringBuilder();

        int i=0;
        while(i<res.length&& res[i] ==0){
            i++;
        }
        while(i<res.length){
            sb.append(res[i]);
            i++;
        }
        return sb.toString();
    }
}
