import java.util.Scanner;


public class DesetHiljada {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		int broj=unos.nextInt();
		if (broj<100)
			System.out.println("Broj je manji od 100");
		else if(broj<1000)
			System.out.println("Broj je manji od 1000");
		else if(broj<10000)
		System.out.println("Pretjerao si!");
}
}