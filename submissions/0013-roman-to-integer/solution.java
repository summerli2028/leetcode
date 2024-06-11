class Solution {
    public int  romanToInt(String s) {
        int sum=0;
        for(int i=0; i<s.length()-1; i++){
            if(s.substring(i, i+1).equals("I")){
                if(s.substring(i+1, i+2).equals("V")||s.substring(i+1, i+2).equals("X")){
                    sum-=1;
                }else{
                    sum+=1;
                }
            }
            if(s.substring(i, i+1).equals("X")){
                if(s.substring(i+1, i+2).equals("L")||s.substring(i+1, i+2).equals("C")){
                    sum-=10;
                }else{
                    sum+=10;
                }
            }
            if(s.substring(i, i+1).equals("C")){
                if(s.substring(i+1, i+2).equals("D")||s.substring(i+1, i+2).equals("M")){
                    sum-=100;
                }else{
                    sum+=100;
                }
            }
            if(s.substring(i, i+1).equals("V")){
                    sum+=5;
            }
            if(s.substring(i, i+1).equals("L")){
                    sum+=50;
            }
            if(s.substring(i, i+1).equals("D")){
                    sum+=500;
            }
            if(s.substring(i, i+1).equals("M")){
                    sum+=1000;
            }
            
        }
        String test = s.substring(s.length()-1);
        if(test.equals("I")){
            sum+=1;
        } else if(test.equals("V")){
            sum+=5;
        } else if(test.equals("X")){
            sum+=10;
        } else if(test.equals("L")){
            sum+=50;
        } else if(test.equals("C")){
            sum+=100;
        } else if(test.equals("D")){
            sum+=500;
        } else if(test.equals("M")){
            sum+=1000;
        }

    return sum; }
}
