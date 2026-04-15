package LinearSearch;

public class string 
{
	public static void main(String[] args) 
	{
		String name ="Abhi";
		char target = 'b';
		System.out.println(first(name,target));
		
		
	}
	
	public static boolean first(String name,char target) 
	
	{
		if(name.length()==0) 
		{
			return false; 
		}
		
		for(int i=0;i<name.length();i++) 
			
		{
			if(target == name.charAt(i)) 
			
			{
				return true;
			}
			
		}
		return false;
	}
	
}
