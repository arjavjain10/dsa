class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();

        if(n == 0) return 0;

        int left = 0, right = 0, maxlen = 1;
        int[] hash = new int[256];

        Arrays.fill(hash, -1);

        while (right < n){
            if(hash[s.charAt(right)] != -1){
                if(hash[s.charAt(right)] >= left){
                    left = hash[s.charAt(right)] + 1;
                }
            }

            int len = right - left + 1;
            maxlen = Math.max(len, maxlen);
            hash[s.charAt(right)] = right;
            right++; 
        }
        return maxlen;
    }
}