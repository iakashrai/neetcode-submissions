class Solution {
    public int numRescueBoats(int[] people, int limit) {
        Arrays.sort(people);
        int low=0,high=people.length-1;
        int count=0;
        while(low<high){
            if((people[low]+people[high])<=limit){
                count++;
                low++;
                high--;
            }else if((people[low]+people[high])>limit){
                high--;
            }
        }

        return (people.length-(count*2))+count;
    }
}