class Solution {
    public int trap(int[] height) {
        int N = height.length;
        int[] leftMax = new int[N];
        int[] rightMax = new int[N];
        leftMax[0] = height[0];
        rightMax[N-1] = height[N-1];
        for(int i=1;i<N;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
        }

        for(int i=N-2;i>=0;i--){
            rightMax[i]=Math.max(height[i],rightMax[i+1]);
        }

        int total = 0;
        for(int i=0;i<N;i++){
            total+=Math.abs(Math.min(rightMax[i],leftMax[i])-height[i]);
        }

        return total;
    }
}
