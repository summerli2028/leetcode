class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix = "";
        int min=10000000;
        for(int i=0; i<strs.length; i++){
            if(strs[i].length()<min){
                min=strs[i].length();
            }
        }
        for(int i=0; i<min; i++){//fixes the index to be checked
            for(int j=0; j<strs.length-1; j++){//changes the element of the array
                if(!(strs[j].substring(i, i+1).equals(strs[j+1].substring(i, i+1)))){
                    return prefix;
                }
            }
            prefix+=strs[0].substring(i, i+1);  
        }
    return prefix;
    }
}
