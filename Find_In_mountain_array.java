/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray arr) {
        int peak = findPeakElement(arr);
        int inc = BS(arr,target,0,peak);
        if(inc!=-1)
        {
            return inc;
        }
        return BS(arr,target,peak+1,arr.length()-1);
    }
    public int findPeakElement(MountainArray nums) {
        int l = 0, r = nums.length() - 1;
        while (l < r) {
            int mid = (l + r) / 2;
            if (nums.get(mid) > nums.get(mid+1))
                r = mid;
            else
                l = mid + 1;
        }
        return l;
    }
    public int BS(MountainArray arr, int target, int st, int end)
    {
        boolean isAsc = arr.get(st) < arr.get(end);
        
        while(st<=end)
        {
            int mid = st+(end-st)/2;
            if(arr.get(mid)==target) return mid;
            if(isAsc)
            {
                if(arr.get(mid)<target) st = mid+1;
                else end = mid-1;
            }
            else{
                if(target>arr.get(mid)) end = mid-1;
                else st = mid+1;
            }
        }
        return -1;
    }
}
