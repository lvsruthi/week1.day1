package week1.day1;

public class Factorial {
	
	public static void main(String args[])
	{
		int number =5;
		int Factorial =1;
		for(int i=number;i>=1;i--)
		{
			Factorial = Factorial * i;
			System.out.println(Factorial+""+i);
			
		}
		System.out.println("Factoria for the given number is"+Factorial);
	}

}

