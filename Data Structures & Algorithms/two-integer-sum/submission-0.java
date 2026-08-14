class Solution {
    public static int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> array = new HashMap<>();
        int [] res = new int[2];
        for(int i =0;i<nums.length;i++){
            int value = target - nums[i];
            if(array.containsKey(value)){
                res[0]=array.get(value);
                res[1]= i;
                return res;
            }else{
                array.put(nums[i],i);
            }
        }
        return res;
    }
}
