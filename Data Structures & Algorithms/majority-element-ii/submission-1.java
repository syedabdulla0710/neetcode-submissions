class Solution {
    public List<Integer> majorityElement(int[] nums) {
      int count1 = 0;
      int count2 = 0;
      Integer cand1 = null;
      Integer cand2 = null; 
      for(int ele:nums){
        if(cand1!=null && cand1==ele){
            count1++;
        }else if(cand2!=null && cand2==ele){
            count2++;
        }else if (count1==0){
            cand1 = ele;
            count1 = 1;
        }else if(count2==0){
            cand2 = ele;
            count2 = 1;
        }else{
            count1--;
            count2--;
        }
      }
        count1 = 0;
        count2 = 0;
        for(int ele:nums){
            if(cand1 != null && ele==cand1) count1++;
            if(cand2!= null && ele==cand2) count2++;
        }
        List<Integer> res = new ArrayList<>();
        int n = nums.length;
        if(count1>n/3) res.add(cand1);
        if(count2>n/3) res.add(cand2);

        return res;
      
    }
}