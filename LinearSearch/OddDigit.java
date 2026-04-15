package LinearSearch;

public class OddDigit {
	public static void main(String[] args) {
		int nums[] = { 12, 345, 2, 6, 7896, 1 };
		System.out.println(findNumber(nums));
	}

	public static int findNumber(int[] nums) {
		int count = 0;
		for (int num : nums) {
			if (event(num)) {
				count++;
			}
		}
		return count;

	} 	

	static boolean event(int num) {
		int digitOfnumber = digit(num);
		return digitOfnumber % 2 != 0;
	}

	private static int digit(int num) {
		int count = 0;
		if (num < 0) {
			num = num * -1;
		}
		if (num == 0) {
			return 1;
		}

		while (num > 0) {
			count++;
			num = num / 10;
		}

		return count;
	}

}
