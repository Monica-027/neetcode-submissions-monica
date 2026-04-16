class Solution {
    public int trap(int[] height) {
        int n  = height.length;
        if(n==0) return 0;

        int[] leftMax = new int[n];  //prefix arr
        int[] rightMax = new int[n]; //suffix arr

        leftMax[0] = height[0]; 
        //since 0th pos already has el we start from 1
        for(int i = 1; i< n; i++){
            // compare lM prevEl with height curr el to get cur lM
            leftMax[i] = Math.max(leftMax[i-1], height[i]);
        }
        //since nthPos -1 already has el we start from nthPos-2
        rightMax[n-1] = height[n-1];
        for(int i = n-2; i>=0; i--){
            // compare rM nextEl with height curr el to get cur rM
            rightMax[i] = Math.max(rightMax[i+1], height[i]);
        }
        
        int res = 0;
        for(int i = 0; i< n ; i++){
        // take min of 2 bar as it decides how much water can be stored - curr height el(As in that space water cant be stored)
        //basically, water stored - space taken(height of bar)
            res+= Math.min(leftMax[i], rightMax[i]) - height[i];
        }
        return res;
    }
}
