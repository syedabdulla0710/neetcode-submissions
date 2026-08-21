class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder res = new StringBuilder();
        int n = word1.length();
        int m = word2.length();
        int i = 0;
        int j = 0;
        while(i<n && j<m){
            res.append(word1.charAt(i));
            res.append(word2.charAt(j));
            i++;
            j++;
        }
        while(i<n){
            res.append(word1.charAt(i));
            i++;
        }
        while(j<m){
            res.append(word2.charAt(j));
            j++;
        }
        return res.toString();
    }
}