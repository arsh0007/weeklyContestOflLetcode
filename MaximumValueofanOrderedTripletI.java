class Solution {
    public long maximumTripletValue(int[] nums) {
        long res =0; 
            for(int i=0; i<nums.length-2; i++)
            {
                    for(int j=i+1; j<nums.length-1; j++)
                    {
                        for(int k=j+1; k<nums.length; k++)
                        {
                                res = Math.max(res, (long)((long)nums[i]-(long)nums[j])*(long)nums[k]);
                        }
                    }
            }
            return res;
    }
}
