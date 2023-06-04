class Solution 
{
    public int semiOrderedPermutation(int[] nums) 
    {
        int a = nums.length;
        int start = 0;
        int end = 0;
            for(int i=0; i<a; i++)
            {
                    if(nums[i]==1||nums[i]==a)
                    {
                            if(nums[i]==1)
                            {
                                    start=i;
                            }
                            else 
                            {
                                    end=i;
                            }
                    }
            }
        int diff = a-end;
        diff--;
        int total= start+diff;
       
        if(start>end)
        {
                total--;
        }
        return total;
    }
}
