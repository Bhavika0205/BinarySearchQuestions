class Solution {
    public boolean search(int[] arr, int target) {
        int lo = 0;
        int hi = arr.length-1;
        while(lo<=hi)
        {
            int mid =lo+(hi-lo)/2;
            if(arr[mid]==target) return true;
            if(arr[lo]==arr[mid] && arr[mid] == arr[hi])
            {
                lo++;
                hi--;
            }
            else if(arr[mid]>=arr[lo])
            {
                if(target<arr[mid] && arr[lo]<=target)
                {
                    hi = mid-1;
                }
                else{
                    lo = mid+1;
                }
            }
            else{
                if(arr[mid]<target && target<=arr[hi])
                {
                    lo = mid+1;
                }
                else{
                    hi = mid-1;
                }
            }
        }
        return false;
    }
}
