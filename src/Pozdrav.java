import java.util.Scanner;
public class Pozdrav {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
		String ime = unos.next();
		System.out.println("Cao " + ime.toUpperCase()+ "!");
	}
}