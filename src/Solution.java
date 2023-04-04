class Solution {
    public int partitionString(String s) {
        StringBuilder sb = new StringBuilder();
        int ans = 0;
        for(int i = 0; i < s.length(); i++) {

            if(sb.toString().contains(String.valueOf(s.charAt(i)))) {
                ans++;
                sb.setLength(0);
            }
            sb.append(s.charAt(i));
        }
        return ans + 1;
    }
}
