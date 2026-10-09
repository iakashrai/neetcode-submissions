class Solution {
    public int trap(int[] height) {
        int N = height.length;
        int leftMax = height[0],rightMax = height[N-1];
        int i=0,j=N-1;
        int total = 0;
        while(i<j){
            if(height[i]<=height[j]){
                leftMax=Math.max(leftMax,height[i]);
                total += leftMax-height[i];
                i++; 
            }else{
                rightMax=Math.max(rightMax,height[j]);
                total += rightMax-height[j];
                j--;
            }
        }

        return total;
    }
}
