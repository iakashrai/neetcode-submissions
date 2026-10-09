class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        int low=0,high=0;
        while(high<nums.length){
            if(high-low<=k){
                if(set.contains(nums[high])){
                    return true;
                }
                set.add(nums[high]);
                high++;
            }else{
                set.remove(nums[low]);
                if(set.contains(nums[high])){
                    return true;
                }
                set.add(nums[high]);
                high++;
                low++;
            }
        }

        return false;
    }
}
