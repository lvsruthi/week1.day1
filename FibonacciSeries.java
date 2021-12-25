package week1.day1;

public class FibonacciSeries {

	public static void main(String[] args)
	{
		int Range =8;
		int FirstNumber =0;
		int SecondNumber =1;
		int Fibonacci=0;
		for(int i=0;i<Range;i++)
		{   System.out.println(FirstNumber);
			Fibonacci = FirstNumber + SecondNumber;
			FirstNumber=SecondNumber;
			SecondNumber=Fibonacci;
		}
	}
}
