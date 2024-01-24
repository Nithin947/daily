class Check
{
	public static void main(String asrgs[])
	{
		int a=1,b=100;
		while(a<=b)
		{	
			double d = Math.sqrt(a);
			if(d == (int)d)
			{
				System.out.println(a+" "+"is perfect square");
			}
			a++;
		}
	}
			
}	
			