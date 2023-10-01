class Solution {
    public long maximumTripletValue(int[] nums) {
        long max1=Integer.MIN_VALUE;
            long max2 = Integer.MIN_VALUE;
            long res =0; 
            long diff =0;
            
            for(int i=0; i<nums.length-1; i++)
            {
                if(nums[i]>max1)
                {
                        max2 = max1=nums[i];
                }
                else{
                        max2=nums[i];
                }
                    if(max1==Integer.MIN_VALUE || max2 == Integer.MIN_VALUE) continue;
                    long currDiff = max1-max2;
                    diff = Math.max(diff, currDiff);
                    long curr = diff * nums[i+1];
                    res=Math.max(curr,res);
            }
            return res<0?0:res;
    }
}
