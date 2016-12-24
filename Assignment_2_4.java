import java.util.Scanner;

class Assignment_2_4 {
	public static void main(String args[])   /*main method*/
	{
		Scanner Input = new Scanner(System.in);  /*input from user*/
		System.out.println("Enter the three number which you want"); /*print the number*/
		int a = Input.nextInt();  /* here a is a variable*/
		int b = Input.nextInt();  /* here b is a variable*/
		int c = Input.nextInt();  /* here c is a variable*/
		if(a>b && a>c)    /* if a is highest among all */ 
		{
			System.out.println("Highest among the all is = "+a); /*print the value of a*/
		}
		else if(b>a && b>c) /*if b is greatest among all*/
		{
			System.out.println("Highest among the all is = "+b); /*print the value of b*/
		}
		else if(c>a && c>b)  /* if c is highest among all*/
		{
			System.out.println("Highest among the all is = "+c); /*print the value of c*/
		}
		else  /* if all the numbers are same*/
		{
			System.out.println("all the number should be different");
		}
	}

}