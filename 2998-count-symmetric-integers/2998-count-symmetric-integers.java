class Solution {
    public int countSymmetricIntegers(int low, int high) {
        
        int count =0;

        for(int i=low;i<=high;i++){
            if(issymetric(i)){
                count++;
            }
        }
        return count;
        
    }

    boolean issymetric(int num){
        String s = Integer.toString(num);
        
        int n=s.length();

        //if number is of odd length then it can't be symmetric
        if(n%2!=0){
            return false;
        }

        int half = n/2;
        int leftSum = 0;
        int rightSum=0;

        for(int i=0;i<half;i++){
            leftSum = leftSum + (s.charAt(i)-'0');
            rightSum = rightSum + (s.charAt(n-i-1)-'0');
        }

        return leftSum==rightSum;

    }
}