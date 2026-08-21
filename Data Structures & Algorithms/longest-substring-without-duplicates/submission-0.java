class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> store = new HashSet<>();
        int left = 0;
        int count = 0;
        for(int right=0;right<s.length();right++){
            while(store.contains(s.charAt(right))){
                store.remove(s.charAt(left));
                left++;
            }
            store.add(s.charAt(right));
            count = Math.max(count,right-left+1);
        }
        return count;
    }
}
