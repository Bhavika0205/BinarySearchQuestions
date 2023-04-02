package lec4;

import java.util.*;

public class floor_of_a_number {

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
		int ans = floor(arr,target);
		System.out.println(ans);
	}
	// here we need to return a greatest number less than or equal to target
	
	public static int floor(int[] arr,int target)
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
		return arr[end];
	}
}
