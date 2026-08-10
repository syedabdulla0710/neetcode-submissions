class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> number = new HashSet<>();
        for(int ele:nums){
            if(!number.add(ele)){
                return true;
            }
        }
        return false;
    }
}