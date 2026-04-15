package BinaraySearch;

// Ceiling = smallest element ≥ target
public class Celling 
{
    public static void main(String[] args) 
    {
        int arr[] = {1,2,3,4,5,9,10,12,13};
        int target = 11;
        
        int ans = cellingsearch(arr, target);
        System.out.println(ans);
    }

    public static int cellingsearch(int[] arr, int target) 
    {
        int start = 0;
        int end  = arr.length - 1;

        if(target > arr[end]) {
            return -1;
        }

        while(start <= end) 
        {
            int mid = start + (end - start) / 2;
            
            if(target > arr[mid]) 
            {
                start = mid + 1;
            }
            else if(target < arr[mid])
            {
                end = mid - 1;
            }
            else 
            {
                return arr[mid]; // return value
            }
        }

        return arr[start]; // ceiling value
    }
}