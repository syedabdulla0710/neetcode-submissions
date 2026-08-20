class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int current = 0;
        Map<Integer,Integer> prefixcount = new HashMap<>();
        prefixcount.put(0,1);
        for(int num : nums){
            current+=num;
            if(prefixcount.containsKey(current-k)){
                count +=prefixcount.get(current-k);
            }
            prefixcount.put(current,prefixcount.getOrDefault(current,0)+1);
        }
        return count;
    }
}