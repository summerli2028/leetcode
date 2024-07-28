class Solution {
    public String intToRoman(int num) {
         String roman = "";
         int temp = num;
         while(temp>0){
            roman+="M".repeat(temp/1000);
            temp-=1000*(temp/1000);
            if(temp/100==9){
                roman+="CM";
                temp-=900;
            }
            roman+="D".repeat(temp/500);
            temp-=500*(temp/500);
            if(temp/100==4){
                roman+="CD";
                temp-=400;
        
            }
            roman+="C".repeat(temp/100);
            temp-=100*(temp/100);
            if(temp/10==9){
                roman+="XC";
                temp-=90;
            }
            roman+="L".repeat(temp/50);
            temp-=50*(temp/50);
            if(40<=temp&&temp<=49){
                roman+="XL";
                temp-=40;
            }
            roman+="X".repeat(temp/10);
            temp-=10*(temp/10);
            if(temp==9){
                roman+="IX";
                return roman;
            }
            roman+="V".repeat(temp/5);
            temp-=5*(temp/5);
            if(temp==4){
                roman+="IV";
                return roman;
            }
            roman+="I".repeat(temp);
            temp-=temp;


         }
         return roman;
    }}
