class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int n = nums.length;

        for(int i=0;i<n;i++){


            //Insert into Map by checking a condition
            if(map.containsKey(nums[i])){
                int value = map.get(nums[i])+1;
                map.put(nums[i],value);
            }else{
                map.put(nums[i],1);
            }

            //Now checking value(count) of each key in the map and if it is  greater than n/2 then simply return it
            if(map.get(nums[i])>n/2){
                return nums[i];
            }

        }
        return -1;
    }
}