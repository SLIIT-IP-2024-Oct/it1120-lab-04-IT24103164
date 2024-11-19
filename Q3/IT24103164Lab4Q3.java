import java.util.Scanner;
public class IT24103164Lab4Q3
{
	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);

		//Take a number from user 
		System.out.print("Enter a number:");
		int number = scanner.nextInt();

		//Check the number using Ternary Operator
		String result = (number > 0) ? "Positive"
			      : (number < 0) ? "Negative"
			      : "Zero";

		//Ouput the result
		System.out.println("The Number is:" +result);
	}
}