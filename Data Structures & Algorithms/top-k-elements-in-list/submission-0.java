class Solution {
    public int[] topKFrequent(int[] nums, int k) {
     Map<Integer,Integer> res = new HashMap<>();
     for(int i=0;i<nums.length;i++){
        res.put(nums[i],res.getOrDefault(nums[i],0)+1);
    }
    List<Integer>[] buckets = new List[nums.length+1];
    for(int ele:res.keySet()){
        int freq = res.get(ele);
        if (buckets[freq]==null){
            buckets[freq] = new ArrayList<>();
        }
        buckets[freq].add(ele);
    }
    int[] result = new int[k];
    int index = 0;
    for(int i=buckets.length-1;i>=0;i--){
        if(buckets[i]!=null){
            for(int num:buckets[i]){
                result[index++]=num;
                if(index==k){
                    return result;
                }
            }
        }
    }
    return result;
    }
}
