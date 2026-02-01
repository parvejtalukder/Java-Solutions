package newpack;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner inp = new Scanner(System.in);
		String word;
		int cnt = 0;
		word = inp.nextLine();
		word = word.toLowerCase();
		int siz = word.length();
		System.out.println("WORD: " + word);
		for(int i = 0; i < siz; i++) {
			char charOne = word.charAt(i);
			if (charOne == 'u' 
			|| charOne == 'o' 
			|| charOne == 'i' 
			|| charOne == 'a' 
			|| charOne == 'e') {
				System.out.println("Indx: " + i + " CHAR: " + charOne);
				cnt++;
			}
		}
		System.out.println("CNT: " + cnt);
		inp.close();
	}

}
