class Solution {
    public int trap(int[] height) {
        int n = height.length;
        if(height== null || n ==0) return 0;

        int res = 0, l = 0, r = n-1;
        int leftMax = height[l], rightMax = height[r];

        while(l<r){
            if(leftMax < rightMax){
                //move pointer
                l++;
                //update leftMax
                leftMax = Math.max(leftMax, height[l]);
                res += leftMax - height[l];
            }else{
                 //move pointer
                r--;
                 //update rightMax
                rightMax = Math.max(rightMax, height[r]);
                res+= rightMax - height[r];
            }
        }
        return res;
    }
}
