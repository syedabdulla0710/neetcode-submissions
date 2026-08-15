class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length())
                return false;
        if(s==null || t==null)
                return false;
        char[] se = s.toCharArray();
        char[] te = t.toCharArray();
        Arrays.sort(se);
        Arrays.sort(te);
        return Arrays.equals(se,te);
    }
}
