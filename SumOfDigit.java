import java.util.*;

class SumOfDigit
{
	public static int sumOfDig(int no)
	{
		int sum=0;
		while(no!=0)
		{
			int n=no%10;
			sum+=n;
			no=no/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.print("Enter number :");
		int no=new java.util.Scanner(System.in).nextInt();

		int op=sumOfDig(no);
		System.out.print(op);
	}
}