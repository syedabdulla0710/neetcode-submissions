class Solution {
    public int trap(int[] height) {
    int l =0;
    int r= height.length-1;
    int lmax = height[l];
    int rmax = height[r];
    int total = 0;
    while(l<r){
        if(height[l]>height[r]){
           total+=rmax-height[r];
           r--;
           if(r>=0){
            rmax = Math.max(rmax,height[r]);
           } 
        }else{
            total +=lmax-height[l];
            l++;
            if(l<height.length){
                lmax = Math.max(lmax,height[l]);
            }
        }
    }
    return total;
    }
}
