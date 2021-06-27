import java.util.Scanner;

public class HackerHackIfElse {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite um numero: ");
		int N = scan.nextInt();

		if (N % 2 != 0) {
			System.out.println("Weird");
		} else {
			if (N >= 2 && N < 5) {
				System.out.println("Not weird");
			}else if(N >= 6 && N <= 20) {
				System.out.println("Weird");
			}else {
				System.out.println("Not Weird");
			}
		}

		scan.close();
	}
}
