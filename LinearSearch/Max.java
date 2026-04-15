package LinearSearch;

public class Max 
{
	public static void main(String[] args) 
	{
		int[] [] accounts = {{1,2,3},{3,2,5}};
		System.out.println(maximumWealth(accounts));
		
	}
	
    public  static int maximumWealth(int[][] accounts) 
    {
    	int max = 0;
    	int ans = Integer.MIN_VALUE;
    	
    	for(int i=0;i<accounts.length;i++) 
    	{
    		for(int j=0;j<accounts[i].length;j++) 
    		{
    			int sum = accounts[i][j];
    			max= sum + max ; 
    		}
    	}
    	
    	if(max>ans) 
    	{
    		 	ans = max;
    	}
    	
    	
    	 
    	
    	
    	
    	return ans;
    }


}
