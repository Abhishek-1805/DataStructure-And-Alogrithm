package LinearSearch;

public class numberOfDigit 
{
	public static void main(String[] args) 
	{
		int a = 1562789;

		System.out.println(digit2(a));
	}
public static int digit2(int a) 
{
	return (int) ((Math.log10(a)) + 1);

	}
}
