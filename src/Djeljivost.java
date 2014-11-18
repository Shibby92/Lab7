import java.util.Scanner;

public class Djeljivost {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int broj = unos.nextInt();
		boolean saDva = false;
		boolean saTri = false;
		if (broj % 2 == 0) {
			saDva = true;
			System.out.println("Djeljiv sa dva");
		}
		if (broj % 3 == 0) {
			saTri = true;
			System.out.println("Djeljiv sa tri");
		}
		if (broj % 4 == 0)
			System.out.println("Djeljiv sa cetiri");
		if (broj % 5 == 0)
			System.out.println("Djeljiv sa pet");
		if ((saDva == true) && (saTri == true))
			System.out.println("Djeljiv sa sest");
	}
}