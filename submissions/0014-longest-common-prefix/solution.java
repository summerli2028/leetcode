class Solution {
    public String longestCommonPrefix(String[] strs) {
        int minlength=201;
        String minstring = "";
        for(String s: strs){
            if(s.length()<minlength){
                minlength=s.length();
                minstring = s;
            }
        }
        String prefix = "";
        String common = "";
        for(int j=0; j<minlength; j++){
            for(int i=0; i<strs.length; i++){
                common = minstring.substring(j, j+1);
                if(!(strs[i].substring(j, j+1).equals(common))){
                    return prefix;
                }
            }
            prefix+=common;
        }
        return prefix;
    }
}
