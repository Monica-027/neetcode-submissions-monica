class Solution {
    public int trap(int[] height) {
        int n = height.length;
        //EDGE CASE -> if arraya is empty
        if(n==0) return 0;

        int res =0;
        for(int i = 0; i<n; i++){
            //temp 
            int leftMax = height[i];
            int rightMax = height[i];

            for(int j=0; j<i; j++){
                leftMax = Math.max(leftMax, height[j]);
            }

            for(int j = i+1; j<n; j++){
                rightMax = Math.max(rightMax, height[j]);
            }

            res+= Math.min(leftMax, rightMax) - height[i];
        }
        return res;

    }
}
