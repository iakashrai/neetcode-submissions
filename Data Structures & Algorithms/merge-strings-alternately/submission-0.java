class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Two Pointers
        // Merge two arrays alternatively.
        
        String result = "";
        int i=0,j=0;
        boolean change = false;
        while(i<word1.length() && j<word2.length()){
            if(change){
                result+=word2.charAt(j);
                change=false;
                j++;
            }else{
                result+=word1.charAt(i);
                change=true;
                i++;
            }
        }

        while(i<word1.length()){
            result+=word1.charAt(i);
            i++;
        }

        while(j<word2.length()){
            result+=word2.charAt(j);
            j++;
        }

        return result;
    }
}