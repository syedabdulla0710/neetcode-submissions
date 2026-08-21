class Solution {
    public int[] twoSum(int[] numbers, int target) {
        Map<Integer,Integer> look = new HashMap<>();
        for(int i = 0;i<numbers.length;i++){
            int find = target-numbers[i];
            if(look.containsKey(find)){
                return new int[]{look.get(find)+1,i+1};
            }
            look.put(numbers[i],i);
        }
        return new int[]{};
    }
}
