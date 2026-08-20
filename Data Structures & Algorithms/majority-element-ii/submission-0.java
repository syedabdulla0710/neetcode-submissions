class Solution {
    public List<Integer> majorityElement(int[] nums) {
        int n = nums.length/3;
        List<Integer> res = new ArrayList<>();
        Map<Integer,Integer> store = new HashMap<>();
        for(int i =0;i<nums.length;i++){
           store.put(nums[i],store.getOrDefault(nums[i],0)+1);
        }
        for(int ele:store.keySet()){
            if(store.get(ele)>n){
                res.add(ele);
            }
        }
        return res;
    }
}