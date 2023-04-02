class Solution {
    public int[] searchRange(int[] nums, int target) {
        int[] ans = {-1,1};
        ans[0] = find(nums,target,true);
        ans[1] = find(nums,target,false);
        
        return ans;
    }
    public int find(int[] nums, int target, boolean first)
    {
        int lo = 0;
        int hi = nums.length-1;
        int ans =-1;
        while(lo<=hi)
        {
            int mid = lo+(hi-lo)/2;
            if(nums[mid]<target)
            {
                lo = mid+1;
            }
            else if(nums[mid]>target)
            {
                hi = mid-1;
            }
            else{
                ans = mid;
                if(first)
                {
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
        }
        return ans;
    }
}
