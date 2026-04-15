package LinearSearch;

public class EvenDigit {

    public static void main(String[] args) {
        int nums[] = {12, 345, 2, 6, 7896};

        System.out.println(findNumbers(nums));

    }
    
    static public int findNumbers(int[] nums) {
        int count = 0;
        for (int num : nums) {
            if (even(num)) {
                count++;
            }
        }
        return count;
    }
    
    // Check whether the digits of an array is even or not  

    static boolean even(int num) {
        int numberOfDigits = digits(num);

        return numberOfDigits % 2 != 0; // FIXED

//        return numberOfDigits % 2 != 0; For Odd digits in array
    }
    
    
    // Check How Many Digits of an single element in an array
    static int digits(int num) {
        if (num < 0) {
            num = num * -1;
        }

        if (num == 0) {
            return 1;
        }
        int count = 0;
        while (num > 0) {
            count++;
            num = num / 10;
        }

        return count;

    }
}
