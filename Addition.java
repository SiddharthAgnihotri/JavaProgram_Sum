import java.util.Scanner;

public class Addition{
	
	public static void main(String[] args){
	
		Scanner sc = new Scanner(System.in);

		System.out.print("1st Number- ");
		int num1 = sc.nextInt();

		System.out.print("2nd Number- ");
		int num2 = sc.nextInt();

		int sum = num1 + num2 ;
		System.out.print("Sum= " + sum);

	}

}
