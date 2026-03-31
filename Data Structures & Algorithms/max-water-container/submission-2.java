// Two pointer(Best Apprach)
class Solution {
    public int maxArea(int[] heights) {
        int l=0 , r = heights.length -1;
        int area =0;
        //run the loop till l==r
        while(l<r){
            //find min as how much water is stored depends on it
            int min = Math.min(heights[l], heights[r]);

            //find the max of all area -> min * diff of idx
            area = Math.max(area, min *(r-l));

 //We move the shorter height to possibly find a taller one,so the min height can inc and give a larger area.
            if(heights[l]<= heights[r]){
                l++; //move l froward to get another num
            }else{
                r--; //move r backward to get another height
            }
        }
        return area;
    }
}


// Intution
// 1st take min height out of two as till that h water can be stored
//tke dif between the idx of both heights
// max-> multiply the diff with height compare using Math.max
// for(int r=l+1; r<heights.length; r++){
//             int h1 = Math.max(max, heigths[i]);
//             int h2 = Math.min()
//             int width = Math.max(max, height[l] - height[r] )
//         }