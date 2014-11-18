import java.util.Scanner;

public class Razlika {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int broj1, broj2;
		broj1 = unos.nextInt();
		broj2 = unos.nextInt();
		int razlika;
		razlika = broj1 - broj2;
		if (razlika<0) 
			razlika = razlika * (-1);
		System.out.println(razlika);
	}
}