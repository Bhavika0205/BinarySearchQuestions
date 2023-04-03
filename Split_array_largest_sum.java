class Solution {
    public int splitArray(int[] nums, int k) {
        int st = 0;
        int end = 0;
        for(int i=0;i<nums.length;i++)
        {
            st = Math.max(st,nums[i]);
            end+=nums[i];
        }
        while(st<end)
        {
            int mid = st+(end-st)/2;
            int pieces=1;
            int sum = 0;
            for(int num:nums)
            {
                if(sum+num>mid)
                {
                    //we can not add any more element into the array we need to create a new array
                    //the sum of the new piece will be equal to the new elemnts we are about to add
                    sum = num;
                    pieces++;
                }
                else{
                    sum+=num;
                }
            }
            if(pieces>k) st = mid+1;
            else{
                end = mid;
            }
        }
        return st;
    }
}
