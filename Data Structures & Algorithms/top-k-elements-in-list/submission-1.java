class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> res = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            res.put(nums[i], res.getOrDefault(nums[i],0)+1);
        }
        List<Integer>[] bucket = new List[nums.length+1];
        for(int ele : res.keySet()){
            int value = res.get(ele);
            if(bucket[value]==null){
                bucket[value] = new ArrayList<>();
            }
            bucket[value].add(ele);
        }
        int[] result = new int[k];
        int index = 0;
        for(int i=bucket.length-1;i>=0;i--){
            if(bucket[i]!=null){
                for(int ele:bucket[i]){
                    result[index++]=ele;
                    if(index==k){
                        return result;
                    }
                }
            }
        }
        return result;
    }
}
