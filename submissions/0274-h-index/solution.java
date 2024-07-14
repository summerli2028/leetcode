
class Solution{
    public int hIndex(int[] citations){
        Arrays.sort(citations);
        int count = 0;
        int index = citations.length; 
        while(index>=0){
            for(int i =0; i<citations.length; i++){
                if(citations[i]>=index && citations.length-i>=index){
                    return index;
                }
            }
            index--;
        }
        return 0;
    }}
