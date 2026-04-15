package LinearSearch;

public class searchInRange 
{
	public static void main(String[] args) 
	{
		int[] arr = {1,2,3,4,5,6,7,8};
		int target = 7;
		int start= 3;
		int end = 7;
		
		System.out.println(range(arr, target, start, end));
		
	}
	
	public static int range(int arr[],int target,int start,int end)
	{
		if(arr.length==0) 
		{
			return -1;
		}
		for(int i = start;i<=end;i++) 
		{
			int element = arr[i];
			if(element == target) 
			{
				return i;
			}
			
		}
		return -1;
		
	}

}
