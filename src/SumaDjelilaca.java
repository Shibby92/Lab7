import java.util.Scanner;

public class SumaDjelilaca {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();
		int uslov = broj;
		int suma = 0;
		for (int a = 2; a <= uslov; a++) {
			while (broj % a == 0) {
				suma = suma + a;
				broj = broj / a;
			}
		}
		suma = suma + 1;
		System.out.println(suma);
	}
}