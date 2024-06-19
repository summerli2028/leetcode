class Solution {
    public boolean isPalindrome(String s) {
        if(s.length()<=1){
            return true;
        }
        int start=0;
        int finish = s.length()-1;
        while(start<=finish){
            char first=s.charAt(start);
            char last = s.charAt(finish);
            if(!Character.isLetterOrDigit(first)){
                start++;
            }else if(!Character.isLetterOrDigit(last)){
                finish--;
            }else{
                if(Character.toLowerCase(first)!=Character.toLowerCase(last)){
                    return false;
                }
                start++;
                finish--;
            }

        }
        return true;
    }
}
