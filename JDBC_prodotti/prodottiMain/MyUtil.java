package prodottiMain;

import java.util.Scanner;

public class MyUtil {
	
	private static Scanner lettore = new Scanner(System.in);
	
	public static int leggiIntero(String messaggio){
		
		System.out.println(messaggio);
		return lettore.nextInt();
		
	}
	

	public static double leggiDouble(String messaggio){
		
		System.out.println(messaggio);
		return lettore.nextDouble();
		
	}
	
	

}
