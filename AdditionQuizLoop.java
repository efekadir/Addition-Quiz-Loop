import java.util.Scanner;

public class AdditionQuizLoop {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n1 = (int)(Math.random() * 10);
		int n2 = (int)(Math.random() * 10);
		int answer = -1;
		
		while (answer != n1 + n2) {
			System.out.print("What is " + n1 + " + " + n2 + " = ");
			answer = sc.nextInt();	
		} 
		System.out.println("Your answer is correct!");
	}
}