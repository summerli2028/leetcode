class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int numDigs = (int)Math.log10(x) +1;
        for(int i=1; i<=numDigs;i++){
            if(((int)(x/Math.pow(10, numDigs-i)))%10!=((int)(x/Math.pow(10, i-1)))%10){
                return false;
            }
        }
        return true;
    }
}
