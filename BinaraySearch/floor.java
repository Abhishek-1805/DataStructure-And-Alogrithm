package BinaraySearch;

// Floor = largest element ≤ target
public class floor 
{
    public static void main(String[] args) 
    {
        int arr [] = {4,5,6,7,8,9,10,11,12,13,14,15};
        int target = 3;
        
        int ans = binary(arr, target);
        System.out.println(ans);
    }

    private static int binary(int[] arr, int target) 
    {
        int start = 0;
        int end = arr.length - 1;

     
        if(target < arr[0]) {
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

        return arr[end]; // floor value
    }
}