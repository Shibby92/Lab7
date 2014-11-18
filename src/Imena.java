import java.util.Scanner;


public class Imena {
	public static void main(String[] args) {
		Scanner unos = new Scanner(System.in);
	String ime = unos.next();
	if(ime.charAt(ime.length()-1)=='a'){
		System.out.println(ime+" je zensko ime!");
	}else
	System.out.println(ime+" je musko ime!");
	}
}