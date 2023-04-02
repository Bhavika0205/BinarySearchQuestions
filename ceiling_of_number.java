package lec4;
import java.util.*;
public class ceiling_of_a_number {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int arr[] = new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i] = scn.nextInt();			
		}
		int target = scn.nextInt();
		int ans = ceiling(arr,target);
		System.out.println(ans);
	}
	//find the smallest element number in the array greater than or equal to target
	// ya toh hume wo number hi mill jaye array mein otherwise
	// we will fing the greater number only when start surpasses end;
	//eg   target = 15    arr=[14,16,18];  here st  = 14, end = 18, mid = 16 but 16>15 so end = mid-1 i.e 14 now target>arr[mid] so st = mid +1 i.e 16 but this interrupts the while loop so we return st
	public static int ceiling(int[] arr,int target)
	{
		int st = 0;
		int end = arr.length-1;
		while(st<=end)
		{
			int mid = st + (end-st)/2;
			if(arr[mid]==target)
			{
				return arr[mid];
			}
			else if(arr[mid]> target)
			{
				end = mid-1;
			}
			else {
				st = mid+1;
			}
		}
		return arr[st];
	}

}
