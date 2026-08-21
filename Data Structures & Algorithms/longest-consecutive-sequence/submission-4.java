class Solution {
    public int longestConsecutive(int[] nums) {
        if(nums==null || nums.length ==0){
            return 0;
        }
        Set<Integer> store = new HashSet<>();
        for(int ele:nums){
            store.add(ele);
        }
        int max = 0;
        for(int i = 0;i<nums.length;i++){
            if (!store.contains(nums[i]-1)){
                int num = nums[i];
                int count = 1;
                while(store.contains(num+1)){
                    num++;
                    count++;
                }
                max=Math.max(max,count);

            }
        }
        
        return max;
    }
}
