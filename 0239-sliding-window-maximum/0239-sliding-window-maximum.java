class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        int N=nums.length;
        int i=0;
        int j=0;
        int[] ans = new int[N-k+1];
        Deque<Integer> dq=new LinkedList<>();
        while(j<N){
            //calculations
            while(dq.size()>0 && dq.peekLast()<nums[j]) {
                dq.removeLast();
            }
            dq.add(nums[j]);

            if((j-i+1)<k){
                j++;
            }else if((j-i+1)==k){
                //store karlunga yaha answer mein aur window slide kardunga
                ans[i]=dq.peek();
				//changes in i before slide
				if(nums[i]==dq.peek()) {
					dq.removeFirst();
				}
                i++;
                j++;
            }
        }
        return ans;
    }
}
//       i
// [5,3,4,2,1]     k = 3
//            j   
// ---------------
//  2 | 1
// ---------------
// ans = {5,4,4}