class Solution {
    public String mergeAlternately(String word1, String word2) {
        // Two Pointers
        // Merge two arrays alternatively.
        
        //In many languages, repeatedly concatenating strings with + inside a loop creates a new string object each time, leading to O(n^2) time complexity. Use a StringBuilder, list of characters, or similar efficient structure to build the result, then join at the end.
        // String result = "";
        // int i=0,j=0;
        // boolean change = false;
        // while(i<word1.length() && j<word2.length()){
        //     if(change){
        //         result+=word2.charAt(j);
        //         change=false;
        //         j++;
        //     }else{
        //         result+=word1.charAt(i);
        //         change=true;
        //         i++;
        //     }
        // }

        // while(i<word1.length()){
        //     result+=word1.charAt(i);
        //     i++;
        // }

        // while(j<word2.length()){
        //     result+=word2.charAt(j);
        //     j++;
        // }

        // return result;

        StringBuilder result = new StringBuilder();
        int i=0,j=0;
        while(i<word1.length() || j<word2.length()){
            if(i<word1.length()){
                result.append(word1.charAt(i));
                i++;
            }
            if(j<word2.length()){
                result.append(word2.charAt(j));
                j++;
            }
        }

        return result.toString();
    }
}