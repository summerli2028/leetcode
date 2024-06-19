class Solution {
    public int lengthOfLastWord(String s) {
        int length = 0;

        for(int i=s.length()-1; i>=0; i--){
            if(!s.substring(i, i+1).equals(" ")){
                length++;
            }
            if(i-1>=0){
            if(s.substring(i-1, i).equals(" ") && !s.substring(i, i+1).equals(" ")){
                break;
            }
            }
        }
        return length;
    }
        
    }

