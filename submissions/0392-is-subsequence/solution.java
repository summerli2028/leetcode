class Solution {
    public boolean isSubsequence(String s, String t) {
        if (s.length()>t.length()){
            return false;
        }
        for(int i=0; i<s.length(); i++){
            if(t.indexOf(s.substring(i, i+1))==-1){
                return false;
            }
            t=t.substring(t.indexOf(s.substring(i, i+1))+1);
        }
        return true;
        

    }
}
