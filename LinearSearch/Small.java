package LinearSearch;

public class Small {
    public static void main(String[] args) {
        int[] arr = {4,5,8,3,2,1};
        System.out.println(search(arr));
    }

    public static int search(int arr[]) {

        if (arr.length == 0) {
            return -1; 
        }

        int temp = arr[0]; 

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < temp) {
                temp = arr[i];
            }
        }

        return temp;
    }
}