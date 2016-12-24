 class Assignment_2_2 {
	public static void main(String args[])   /* main method */
	{
		int number=5;     /* number is a variable*/ 
		for(int i=0;i<number;i++) /* first for loop*/ 
		{
			for(int j=0;j<number;j++) /* inside another for loop*/
			{
				if(i==j || j==(number-i-1)) /* if else case*/
				{
					System.out.print("*");	/* printing * in the output*/
				}
				else
				{
					System.out.print("_");
				}
			}
			System.out.println("");
			
		}
	}
}