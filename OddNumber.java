package week1.day1;

public class OddNumber {

	public static void main(String[] args) {
		
		System.out.println("Printing only the odd numbers from 1 to 20");
		
		for(int i=1; i<=20;i++)
		{
			if(i%2==0)
				continue;
			else
				System.out.println(i);
			
			
		}
	}
}
