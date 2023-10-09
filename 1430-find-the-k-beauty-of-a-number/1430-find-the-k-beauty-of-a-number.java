class Solution {
    public int divisorSubstrings(int num, int k) {
        String numStr = String.valueOf(num); //10
        int N = numStr.length(); //2
        int i=0;
        int j=0;
        int count = 0;

        String res = "";

        while(j<N){
            //calculations
            res = res + numStr.charAt(j);  //10
            // sb.append(numStr.charAt(j));


            if((j-i+1)<k){
                j++;
            }else if((j-i+1)==k){
                //ans store and slide the window
                //convert string into integer and check if it is divisible by num or not
                int val = Integer.valueOf(res); 
                if(val!=0 && num%val==0){
                    count++;
                }
                res=res.substring(1);

                i++;
                j++;
            }
        }
        return count;
    }
}