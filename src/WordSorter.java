import java.util.ArrayList;
import java.util.Scanner;

public class WordSorter {
	static ArrayList<String> words = new ArrayList<String>();
	static Scanner keyboardInput = new Scanner(System.in);

	public static void main(String[] args) {
		boolean done = false;
		String temp = "";
		while (!done) {
			System.out.println("Enter your word. If you are done, enter 0.");
			String input = keyboardInput.next();
			if (input.equals("0")) {
				done = true;
			} else {
				words.add(input);
			}
		}
		for (int i = 0; i < words.size(); i++) {
			for (int q = 1; q < words.size() - i; q++) {
				if (words.get(q - 1).compareTo(words.get(q)) > 0) {
					temp = words.get(q - 1);
					words.set(q - 1, words.get(q));
					words.set(q, temp);
				}
			}
		}
		
		System.out.print(words);
	}
}
