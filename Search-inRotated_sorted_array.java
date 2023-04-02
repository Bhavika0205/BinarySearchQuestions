class Solution {
    public int search(int[] arr, int target) {
        int st  = 0;
        int end = arr.length-1;
        while(st<=end)
        {
            int mid = st+(end-st)/2;
            if(arr[mid]==target) return mid;
            if(arr[mid]>=arr[st])
            {
                if(arr[mid]>target && arr[st]<=target)
                {
                    end = mid-1;
                }
                else{
                    st = mid+1;
                }
            }
            else{
                if(target>arr[mid] && target<=arr[end])
                {
                    st = mid+1;
                }
                else{
                    end = mid-1;
                }
            }
        }
        return -1;
    }
}
